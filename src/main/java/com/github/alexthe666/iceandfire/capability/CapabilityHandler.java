package com.github.alexthe666.iceandfire.capability;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.api.IEntityEffectCapability;
import com.github.alexthe666.iceandfire.api.InFCapabilities;
import com.github.alexthe666.iceandfire.capability.entityeffect.EntityEffectProvider;
import com.github.alexthe666.iceandfire.message.MessageEntityEffect;
import com.github.alexthe666.iceandfire.message.MessageResetEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CapabilityHandler {

    private static final ResourceLocation ENTITY_EFFECT = new ResourceLocation(IceAndFire.MODID, "entity_effect");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityLivingBase) {
            event.addCapability(ENTITY_EFFECT, new EntityEffectProvider());
        }
    }

    @SubscribeEvent
    public void onLivingUpdate(LivingEvent.LivingUpdateEvent event) {
        EntityLivingBase entity = event.getEntityLiving();
        World world = entity.world;

        IEntityEffectCapability capability = InFCapabilities.getEntityEffectCapability(entity);
        if (capability == null) return;
        capability.tickUpdate(entity, world); //Tick both client and server

        // Send packet from server if a sync is necessary
        if (!world.isRemote && capability.isDirty()) {
            syncEntityEffectUpdate(capability, entity);
        }
    }

    @SubscribeEvent
    public void onEntityJoinWorld(EntityJoinWorldEvent event) {
        if (!event.getWorld().isRemote && event.getEntity() instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.getEntity();
            IEntityEffectCapability capability = InFCapabilities.getEntityEffectCapability(player);
            if(capability == null) return;
            messageEntityEffectClient(capability, player);
        }
    }

    @SubscribeEvent
    public void onPlayerStartTracking(PlayerEvent.StartTracking event) {
        if (!event.getEntityPlayer().world.isRemote && event.getTarget() instanceof EntityLivingBase) {
            EntityLivingBase entity = (EntityLivingBase) event.getTarget();
            IEntityEffectCapability capability = InFCapabilities.getEntityEffectCapability(entity);
            if(capability == null) return;
            syncEntityEffectDirect(capability, entity, (EntityPlayerMP) event.getEntityPlayer());
        }
    }

    /**
     * Update or reset effect for entity and tracking entities if update is needed, then mark clean
     */
    public static void syncEntityEffectUpdate(IEntityEffectCapability capability, EntityLivingBase entity) {
        if (capability.getPreviousEffect().syncToAllTracking() || capability.getEffect().syncToAllTracking()) {
            messageEntityEffectTracking(capability, entity);
        }
        if (entity instanceof EntityPlayerMP) {
            if (capability.getPreviousEffect().syncToAffectedClient() || capability.getEffect().syncToAffectedClient()) {
                messageEntityEffectClient(capability, (EntityPlayerMP) entity);
            }
        }
        capability.markClean();
    }

    /**
     * Update or reset effect of entity for specific tracking entity
     */
    public static void syncEntityEffectDirect(IEntityEffectCapability capability, EntityLivingBase entity, EntityPlayerMP player) {
        messageEntityEffectDirectTracking(capability, entity, player);
    }

    /**
     * Update all players tracking entity with current entity effect, or set to NONE if tracking is not needed
     */
    private static void messageEntityEffectTracking(IEntityEffectCapability capability, EntityLivingBase entity) {
        if (!capability.getEffect().syncToAllTracking()) {
            IceAndFire.NETWORK_WRAPPER.sendToAllTracking(new MessageResetEntityEffect(entity.getEntityId()), entity);
        }
        else {
            IceAndFire.NETWORK_WRAPPER.sendToAllTracking(new MessageEntityEffect(EntityEffectProvider.writeNBT(capability, null), entity.getEntityId()), entity);
        }
    }

    /**
     * Update specific player tracking entity with current entity effect, or set to NONE if tracking is not needed
     */
    private static void messageEntityEffectDirectTracking(IEntityEffectCapability capability, EntityLivingBase entity, EntityPlayerMP player) {
        if (!capability.getEffect().syncToAllTracking()) {
            IceAndFire.NETWORK_WRAPPER.sendTo(new MessageResetEntityEffect(entity.getEntityId()), player);
        }
        else {
            IceAndFire.NETWORK_WRAPPER.sendTo(new MessageEntityEffect(EntityEffectProvider.writeNBT(capability, null), entity.getEntityId()), player);
        }
    }

    /**
     * Update client player with current player effect, or set to NONE if tracking is not needed
     */
    private static void messageEntityEffectClient(IEntityEffectCapability capability, EntityPlayerMP player) {
        if (!capability.getEffect().syncToAffectedClient()) {
            IceAndFire.NETWORK_WRAPPER.sendTo(new MessageResetEntityEffect(player.getEntityId()), player);
        }
        else {
            IceAndFire.NETWORK_WRAPPER.sendTo(new MessageEntityEffect(EntityEffectProvider.writeNBT(capability, null), player.getEntityId()), player);
        }
    }
}