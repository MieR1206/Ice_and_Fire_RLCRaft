package com.github.alexthe666.iceandfire.client.model;

import com.github.alexthe666.iceandfire.entity.EntityHippogryph;
import com.github.alexthe666.iceandfire.enums.EnumHippogryphTypes;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.entity.Entity;

public class ModelHippogryph extends ModelDragonBase {
	public AdvancedModelRenderer Body;
	public AdvancedModelRenderer Neck;
	public AdvancedModelRenderer HindThighR;
	public AdvancedModelRenderer Tail1;
	public AdvancedModelRenderer HindThighL;
	public AdvancedModelRenderer BackLegR1;
	public AdvancedModelRenderer BackLegR1_1;
	public AdvancedModelRenderer WingL;
	public AdvancedModelRenderer WingR;
	public AdvancedModelRenderer Saddle;
	public AdvancedModelRenderer Neck2;
	public AdvancedModelRenderer Crest1;
	public AdvancedModelRenderer Head;
	public AdvancedModelRenderer HeadPivot;
	public AdvancedModelRenderer Jaw;
	public AdvancedModelRenderer Beak;
	public AdvancedModelRenderer Quill_R;
	public AdvancedModelRenderer Quill_L;
	public AdvancedModelRenderer Crest1_1;
	public AdvancedModelRenderer NoseBand;
	public AdvancedModelRenderer BeakTip;
	public AdvancedModelRenderer Beak2;
	public AdvancedModelRenderer ReinL;
	public AdvancedModelRenderer ReinR;
	public AdvancedModelRenderer HindLegR;
	public AdvancedModelRenderer HindFootR;
	public AdvancedModelRenderer Tail2;
	public AdvancedModelRenderer Tail3;
	public AdvancedModelRenderer HindLegL;
	public AdvancedModelRenderer HindFootL;
	public AdvancedModelRenderer BackLegR2;
	public AdvancedModelRenderer ToeR3;
	public AdvancedModelRenderer ToeL4;
	public AdvancedModelRenderer ToeR2;
	public AdvancedModelRenderer ToeR1;
	public AdvancedModelRenderer BackLegR2_1;
	public AdvancedModelRenderer ToeR3_1;
	public AdvancedModelRenderer ToeL4_1;
	public AdvancedModelRenderer ToeR2_1;
	public AdvancedModelRenderer ToeR1_1;
	public AdvancedModelRenderer WingL2;
	public AdvancedModelRenderer WingL3;
	public AdvancedModelRenderer WingL21;
	public AdvancedModelRenderer FingerL1;
	public AdvancedModelRenderer FingerL2;
	public AdvancedModelRenderer FingerL3;
	public AdvancedModelRenderer FingerL4;
	public AdvancedModelRenderer WingR2;
	public AdvancedModelRenderer WingR3;
	public AdvancedModelRenderer WingR21;
	public AdvancedModelRenderer FingerR1;
	public AdvancedModelRenderer FingerR2;
	public AdvancedModelRenderer FingerR3;
	public AdvancedModelRenderer FingerR4;
	public AdvancedModelRenderer ChestR;
	public AdvancedModelRenderer ChestL;
	public AdvancedModelRenderer Saddleback;
	public AdvancedModelRenderer SaddleFront;
	public AdvancedModelRenderer StirrupL;
	public AdvancedModelRenderer StirrupR;
	public AdvancedModelRenderer StirrupIronL;
	public AdvancedModelRenderer StirrupIronR;
	private ModelAnimator animator;

	public ModelHippogryph() {
		this.textureWidth = 256;
		this.textureHeight = 128;
		this.ChestR = new AdvancedModelRenderer(this, 0, 34);
		this.ChestR.setRotationPoint(-4.5F, 1.0F, 8.0F);
		this.ChestR.addBox(-3.0F, 0.0F, -3.0F, 8, 8, 3, 0.0F);
		this.setRotateAngle(ChestR, 0.0F, 1.5707963267948966F, 0.0F);
		this.StirrupIronL = new AdvancedModelRenderer(this, 74, 0);
		this.StirrupIronL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.StirrupIronL.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
		this.WingR2 = new AdvancedModelRenderer(this, 80, 90);
		this.WingR2.setRotationPoint(-0.4F, 7.6F, -2.8F);
		this.WingR2.addBox(-0.4F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
		this.setRotateAngle(WingR2, 1.5481070465189704F, 0.0F, 0.17453292519943295F);
		this.FingerL3 = new AdvancedModelRenderer(this, 40, 80);
		this.FingerL3.setRotationPoint(0.0F, 15.0F, 4.4F);
		this.FingerL3.addBox(-0.8F, -0.1F, -2.0F, 1, 16, 3, 0.0F);
		this.setRotateAngle(FingerL3, 0.08726646259971647F, 0.0F, 0.0F);
		this.HindFootR = new AdvancedModelRenderer(this, 96, 51);
		this.HindFootR.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.HindFootR.addBox(-1.5F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
		this.FingerR1 = new AdvancedModelRenderer(this, 60, 80);
		this.FingerR1.mirror = true;
		this.FingerR1.setRotationPoint(0.0F, 15.0F, 0.1F);
		this.FingerR1.addBox(-0.2F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
		this.setRotateAngle(FingerR1, 0.12217304763960307F, 0.0F, 0.0F);
		this.BackLegR2_1 = new AdvancedModelRenderer(this, 81, 42);
		this.BackLegR2_1.mirror = true;
		this.BackLegR2_1.setRotationPoint(0.0F, 6.9F, 0.8F);
		this.BackLegR2_1.addBox(-1.0F, 0.0F, -0.7F, 2, 10, 3, 0.0F);
		this.setRotateAngle(BackLegR2_1, -0.31869712141416456F, 0.0F, 0.0F);
		this.HindLegR = new AdvancedModelRenderer(this, 96, 43);
		this.HindLegR.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.HindLegR.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.FingerL1 = new AdvancedModelRenderer(this, 60, 80);
		this.FingerL1.setRotationPoint(0.0F, 15.0F, 0.1F);
		this.FingerL1.addBox(-0.8F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
		this.setRotateAngle(FingerL1, 0.12217304763960307F, 0.0F, 0.0F);
		this.FingerL4 = new AdvancedModelRenderer(this, 30, 80);
		this.FingerL4.setRotationPoint(0.0F, 15.0F, 6.6F);
		this.FingerL4.addBox(-0.9F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
		this.Saddleback = new AdvancedModelRenderer(this, 80, 9);
		this.Saddleback.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.Saddleback.addBox(-4.0F, -1.0F, 3.0F, 8, 1, 2, 0.0F);
		this.Tail3 = new AdvancedModelRenderer(this, 24, 3);
		this.Tail3.setRotationPoint(0.0F, -0.2F, 6.3F);
		this.Tail3.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
		this.setRotateAngle(Tail3, -0.3490658503988659F, 0.0F, 0.0F);
		this.WingR21 = new AdvancedModelRenderer(this, 80, 90);
		this.WingR21.setRotationPoint(0.5F, 0.0F, 0.0F);
		this.WingR21.addBox(-0.6F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
		this.Tail2 = new AdvancedModelRenderer(this, 38, 7);
		this.Tail2.setRotationPoint(0.0F, 0.0F, 2.6F);
		this.Tail2.addBox(-1.5F, -2.0F, 0.0F, 3, 4, 7, 0.0F);
		this.ReinL = new AdvancedModelRenderer(this, 46, 55);
		this.ReinL.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ReinL.addBox(3.1F, -6.3F, -3.4F, 0, 3, 19, 0.0F);
		this.setRotateAngle(ReinL, -0.04363323129985824F, 0.0F, 0.0F);
		this.Tail1 = new AdvancedModelRenderer(this, 44, 0);
		this.Tail1.setRotationPoint(0.0F, -8.1F, 5.0F);
		this.Tail1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.setRotateAngle(Tail1, -1.1344640137963142F, 0.0F, 0.0F);
		this.BackLegR1 = new AdvancedModelRenderer(this, 66, 40);
		this.BackLegR1.setRotationPoint(-4.2F, -3.9F, -17.0F);
		this.BackLegR1.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 4, 0.0F);
		this.ChestL = new AdvancedModelRenderer(this, 0, 47);
		this.ChestL.setRotationPoint(4.5F, 1.0F, 8.0F);
		this.ChestL.addBox(-3.0F, 0.0F, 0.0F, 8, 8, 3, 0.0F);
		this.setRotateAngle(ChestL, 0.0F, 1.5707963267948966F, 0.0F);
		this.ToeL4 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeL4.mirror = true;
		this.ToeL4.setRotationPoint(-0.6F, 9.8F, 0.2F);
		this.ToeL4.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeL4, -1.2292353921796064F, 0.9560913642424937F, 0.0F);
		this.ToeR3_1 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR3_1.mirror = true;
		this.ToeR3_1.setRotationPoint(0.0F, 9.8F, -0.7F);
		this.ToeR3_1.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR3_1, -1.0927506446736497F, 0.0F, 0.0F);
		this.ToeR2_1 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR2_1.mirror = true;
		this.ToeR2_1.setRotationPoint(0.6F, 9.8F, 0.2F);
		this.ToeR2_1.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR2_1, -1.1838568316277536F, -0.9560913642424937F, 0.0F);
		this.Quill_R = new AdvancedModelRenderer(this, 22, 99);
		this.Quill_R.setRotationPoint(-2.0F, -4.2F, 1.9F);
		this.Quill_R.addBox(-0.5F, -4.5F, -0.6F, 1, 5, 2, 0.0F);
		this.setRotateAngle(Quill_R, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
		this.WingR3 = new AdvancedModelRenderer(this, 124, 86);
		this.WingR3.setRotationPoint(0.0F, 7.6F, 0.0F);
		this.WingR3.addBox(-0.3F, -0.1F, -2.0F, 1, 18, 10, 0.0F);
		this.ToeR1_1 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR1_1.mirror = true;
		this.ToeR1_1.setRotationPoint(0.0F, 9.8F, 0.9F);
		this.ToeR1_1.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR1_1, -1.8212510744560826F, 3.141592653589793F, 0.0F);
		this.Beak = new AdvancedModelRenderer(this, 0, 84);
		this.Beak.setRotationPoint(0.0F, -0.6F, -4.8F);
		this.Beak.addBox(-2.01F, -3.2F, -4.0F, 4, 4, 5, 0.0F);
		this.FingerR3 = new AdvancedModelRenderer(this, 40, 80);
		this.FingerR3.mirror = true;
		this.FingerR3.setRotationPoint(0.0F, 15.0F, 4.5F);
		this.FingerR3.addBox(-0.2F, -0.1F, -2.0F, 1, 16, 3, 0.0F);
		this.setRotateAngle(FingerR3, 0.08726646259971647F, 0.0F, 0.0F);
		this.FingerL2 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerL2.setRotationPoint(-0.1F, 15.0F, 2.0F);
		this.FingerL2.addBox(-0.8F, -0.1F, -2.0F, 1, 14, 3, 0.0F);
		this.setRotateAngle(FingerL2, 0.10471975511965977F, 0.0F, 0.0F);
		this.BeakTip = new AdvancedModelRenderer(this, 14, 99);
		this.BeakTip.setRotationPoint(0.0F, 0.6F, -2.7F);
		this.BeakTip.addBox(-1.0F, -2.8F, -1.7F, 2, 5, 1, 0.0F);
		this.Crest1_1 = new AdvancedModelRenderer(this, 30, 100);
		this.Crest1_1.setRotationPoint(0.0F, -5.4F, 3.1F);
		this.Crest1_1.addBox(0.0F, -8.0F, 0.1F, 1, 8, 6, 0.0F);
		this.setRotateAngle(Crest1_1, -2.231054382824351F, 0.0F, 0.0F);
		this.ToeR3 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR3.mirror = true;
		this.ToeR3.setRotationPoint(0.0F, 9.8F, -0.7F);
		this.ToeR3.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR3, -1.0927506446736497F, 0.0F, 0.0F);
		this.HindFootL = new AdvancedModelRenderer(this, 96, 51);
		this.HindFootL.mirror = true;
		this.HindFootL.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.HindFootL.addBox(-2.5F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
		this.FingerR4 = new AdvancedModelRenderer(this, 30, 80);
		this.FingerR4.mirror = true;
		this.FingerR4.setRotationPoint(0.0F, 15.6F, 6.6F);
		this.FingerR4.addBox(-0.1F, -0.1F, -2.0F, 1, 11, 3, 0.0F);
		this.BackLegR1_1 = new AdvancedModelRenderer(this, 66, 40);
		this.BackLegR1_1.mirror = true;
		this.BackLegR1_1.setRotationPoint(4.2F, -3.9F, -17.0F);
		this.BackLegR1_1.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 4, 0.0F);
		this.WingL3 = new AdvancedModelRenderer(this, 124, 86);
		this.WingL3.mirror = true;
		this.WingL3.setRotationPoint(0.0F, 7.6F, 0.0F);
		this.WingL3.addBox(-0.7F, -0.1F, -2.0F, 1, 18, 10, 0.0F);
		this.Jaw = new AdvancedModelRenderer(this, 24, 68);
		this.Jaw.setRotationPoint(0.0F, 0.4F, -3.0F);
		this.Jaw.addBox(-2.0F, -0.3F, -5.4F, 4, 1, 7, 0.0F);
		this.setRotateAngle(Jaw, -0.045553093477052F, 0.0F, 0.0F);
		this.ToeL4_1 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeL4_1.mirror = true;
		this.ToeL4_1.setRotationPoint(-0.6F, 9.8F, 0.2F);
		this.ToeL4_1.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeL4_1, -1.2292353921796064F, 0.6108652381980153F, 0.0F);
		this.HindLegL = new AdvancedModelRenderer(this, 96, 43);
		this.HindLegL.mirror = true;
		this.HindLegL.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.HindLegL.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.ToeR1 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR1.mirror = true;
		this.ToeR1.setRotationPoint(0.0F, 9.8F, 0.9F);
		this.ToeR1.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR1, -1.8212510744560826F, 3.141592653589793F, 0.0F);
		this.Body = new AdvancedModelRenderer(this, 0, 34);
		this.Body.setRotationPoint(0.0F, 11.0F, 9.0F);
		this.Body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
		this.Saddle = new AdvancedModelRenderer(this, 80, 0);
		this.Saddle.setRotationPoint(0.0F, -8.9F, -7.0F);
		this.Saddle.addBox(-5.0F, 0.0F, -3.0F, 10, 1, 8, 0.0F);
		this.WingL = new AdvancedModelRenderer(this, 100, 107);
		this.WingL.mirror = true;
		this.WingL.setRotationPoint(4.2F, -6.6F, -13.2F);
		this.WingL.addBox(-0.1F, 0.0F, -5.0F, 1, 8, 12, 0.0F);
		this.setRotateAngle(WingL, 0.12217304763960307F, 0.3839724354387525F, -0.6981317007977318F);
		this.WingR = new AdvancedModelRenderer(this, 100, 107);
		this.WingR.setRotationPoint(-4.2F, -6.6F, -13.2F);
		this.WingR.addBox(-0.9F, 0.0F, -5.0F, 1, 8, 12, 0.0F);
		this.setRotateAngle(WingR, 0.12217304763960307F, -0.3839724354387525F, 0.6981317007977318F);
		this.WingL2 = new AdvancedModelRenderer(this, 80, 90);
		this.WingL2.mirror = true;
		this.WingL2.setRotationPoint(0.4F, 7.6F, -2.8F);
		this.WingL2.addBox(-0.6F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
		this.setRotateAngle(WingL2, 1.5481070465189704F, 0.0F, -0.17453292519943295F);
		this.WingL21 = new AdvancedModelRenderer(this, 80, 90);
		this.WingL21.mirror = true;
		this.WingL21.setRotationPoint(-0.5F, 0.0F, 0.0F);
		this.WingL21.addBox(-0.4F, -2.5F, -2.1F, 1, 11, 11, 0.0F);
		this.Crest1 = new AdvancedModelRenderer(this, 30, 100);
		this.Crest1.setRotationPoint(0.0F, -10.4F, 6.1F);
		this.Crest1.addBox(0.0F, -8.0F, 0.1F, 1, 8, 6, 0.0F);
		this.setRotateAngle(Crest1, -2.4586453172844123F, 0.0F, 0.0F);
		this.Neck = new AdvancedModelRenderer(this, 1, 109);
		this.Neck.setRotationPoint(0.0F, -1.1F, -18.2F);
		this.Neck.addBox(-3.0F, -6.6F, -2.2F, 6, 9, 9, 0.0F);
		this.setRotateAngle(Neck, 0.7740535232594852F, 0.0F, 0.0F);
		this.Beak2 = new AdvancedModelRenderer(this, 0, 84);
		this.Beak2.setRotationPoint(0.0F, 0.1F, 0.0F);
		this.Beak2.addBox(-1.99F, -3.2F, -4.0F, 4, 4, 5, 0.0F);
		this.StirrupIronR = new AdvancedModelRenderer(this, 74, 4);
		this.StirrupIronR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.StirrupIronR.addBox(-0.5F, 6.0F, -1.0F, 1, 2, 2, 0.0F);
		this.HindThighR = new AdvancedModelRenderer(this, 96, 29);
		this.HindThighR.setRotationPoint(-4.0F, -1.0F, 2.0F);
		this.HindThighR.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
		this.NoseBand = new AdvancedModelRenderer(this, 85, 60);
		this.NoseBand.setRotationPoint(0.0F, 6.5F, -2.2F);
		this.NoseBand.addBox(-3.0F, -11.1F, -7.0F, 6, 6, 12, 0.0F);
		this.setRotateAngle(NoseBand, 0.091106186954104F, 0.0F, 0.0F);
		this.ToeR2 = new AdvancedModelRenderer(this, 51, 43);
		this.ToeR2.mirror = true;
		this.ToeR2.setRotationPoint(0.6F, 9.8F, 0.2F);
		this.ToeR2.addBox(-0.5F, -0.5F, -0.7F, 1, 5, 2, 0.0F);
		this.setRotateAngle(ToeR2, -1.1838568316277536F, -0.6108652381980153F, 0.0F);
		this.FingerR2 = new AdvancedModelRenderer(this, 50, 80);
		this.FingerR2.mirror = true;
		this.FingerR2.setRotationPoint(0.1F, 15.0F, 2.0F);
		this.FingerR2.addBox(-0.2F, -0.1F, -2.0F, 1, 14, 3, 0.0F);
		this.setRotateAngle(FingerR2, 0.10471975511965977F, 0.0F, 0.0F);
		this.StirrupR = new AdvancedModelRenderer(this, 80, 0);
		this.StirrupR.setRotationPoint(-5.0F, 1.0F, 0.0F);
		this.StirrupR.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.Head = new AdvancedModelRenderer(this, 0, 68);
		this.Head.addBox(-2.5F, -4.7F, -3.9F, 5, 6, 8, 0.0F);
		this.HeadPivot = new AdvancedModelRenderer(this, 0, 68);
		this.HeadPivot.setRotationPoint(0.0F, -7.8F, 1.2F);
		this.setRotateAngle(HeadPivot, 0.36425021489121656F, 0.0F, 0.0F);
		this.SaddleFront = new AdvancedModelRenderer(this, 106, 9);
		this.SaddleFront.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.SaddleFront.addBox(-1.5F, -1.0F, -3.0F, 3, 1, 2, 0.0F);
		this.StirrupL = new AdvancedModelRenderer(this, 70, 0);
		this.StirrupL.setRotationPoint(5.0F, 1.0F, 0.0F);
		this.StirrupL.addBox(-0.5F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
		this.Quill_L = new AdvancedModelRenderer(this, 22, 99);
		this.Quill_L.mirror = true;
		this.Quill_L.setRotationPoint(2.0F, -4.3F, 1.9F);
		this.Quill_L.addBox(-0.5F, -4.5F, -0.6F, 1, 5, 2, 0.0F);
		this.setRotateAngle(Quill_L, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
		this.BackLegR2 = new AdvancedModelRenderer(this, 81, 42);
		this.BackLegR2.setRotationPoint(0.0F, 6.9F, 0.8F);
		this.BackLegR2.addBox(-1.0F, 0.0F, -0.7F, 2, 10, 3, 0.0F);
		this.setRotateAngle(BackLegR2, -0.31869712141416456F, 0.0F, 0.0F);
		this.HindThighL = new AdvancedModelRenderer(this, 96, 29);
		this.HindThighL.mirror = true;
		this.HindThighL.setRotationPoint(4.0F, -1.0F, 2.0F);
		this.HindThighL.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
		this.Neck2 = new AdvancedModelRenderer(this, 36, 108);
		this.Neck2.setRotationPoint(0.0F, -6.8F, 0.2F);
		this.Neck2.addBox(-2.02F, -8.5F, -1.6F, 4, 10, 7, 0.0F);
		this.setRotateAngle(Neck2, -0.6829473363053812F, 0.0F, 0.0F);
		this.ReinR = new AdvancedModelRenderer(this, 46, 55);
		this.ReinR.mirror = true;
		this.ReinR.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.ReinR.addBox(-3.1F, -6.0F, -3.4F, 0, 3, 19, 0.0F);
		this.setRotateAngle(ReinR, -0.04363323129985824F, 0.0F, 0.0F);
		this.BackLegR2.addChild(this.ToeR1);
		this.Tail1.addChild(this.Tail2);
		this.Saddle.addChild(this.StirrupL);
		this.BackLegR2.addChild(this.ToeL4);
		this.Head.addChild(this.NoseBand);
		this.WingL2.addChild(this.WingL21);
		this.WingL3.addChild(this.FingerL2);
		this.HindLegR.addChild(this.HindFootR);
		this.Neck.addChild(this.Crest1);
		this.BackLegR1.addChild(this.BackLegR2);
		this.Body.addChild(this.HindThighL);
		this.HindThighL.addChild(this.HindLegL);
		this.Body.addChild(this.BackLegR1_1);
		this.WingR3.addChild(this.FingerR3);
		this.Head.addChild(this.Jaw);
		this.Head.addChild(this.Quill_L);
		this.Head.addChild(this.Crest1_1);
		this.BackLegR2_1.addChild(this.ToeL4_1);
		this.WingL3.addChild(this.FingerL3);
		this.BackLegR2_1.addChild(this.ToeR3_1);
		this.WingR3.addChild(this.FingerR2);
		this.Body.addChild(this.WingL);
		this.Saddle.addChild(this.Saddleback);
		this.Beak.addChild(this.BeakTip);
		this.Saddle.addChild(this.SaddleFront);
		this.StirrupR.addChild(this.StirrupIronR);
		this.Neck.addChild(this.Neck2);
		this.Beak.addChild(this.Beak2);
		this.Body.addChild(this.Saddle);
		this.NoseBand.addChild(this.ReinR);
		this.BackLegR1_1.addChild(this.BackLegR2_1);
		this.WingL.addChild(this.WingL2);
		this.HindThighR.addChild(this.HindLegR);
		this.WingR2.addChild(this.WingR21);
		this.StirrupL.addChild(this.StirrupIronL);
		this.Body.addChild(this.Neck);
		this.NoseBand.addChild(this.ReinL);
		this.BackLegR2_1.addChild(this.ToeR1_1);
		this.WingL2.addChild(this.WingL3);
		this.WingR3.addChild(this.FingerR4);
		this.Saddle.addChild(this.StirrupR);
		this.WingL3.addChild(this.FingerL1);
		this.WingR.addChild(this.WingR2);
		this.BackLegR2_1.addChild(this.ToeR2_1);
		this.WingR3.addChild(this.FingerR1);
		this.Head.addChild(this.Beak);
		this.WingR2.addChild(this.WingR3);
		this.Neck2.addChild(this.HeadPivot);
		this.HeadPivot.addChild(this.Head);
		this.WingL3.addChild(this.FingerL4);
		this.Tail2.addChild(this.Tail3);
		this.BackLegR2.addChild(this.ToeR3);
		this.HindLegL.addChild(this.HindFootL);
		this.Body.addChild(this.Tail1);
		this.BackLegR2.addChild(this.ToeR2);
		this.Body.addChild(this.HindThighR);
		this.Body.addChild(this.BackLegR1);
		this.Saddle.addChild(this.ChestR);
		this.Body.addChild(this.WingR);
		this.Saddle.addChild(this.ChestL);
		this.Head.addChild(this.Quill_R);
		this.animator = ModelAnimator.create();
		this.updateDefaultPose();
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
		if (this.isChild) {
			this.Body.setShouldScaleChildren(true);
			this.Head.setShouldScaleChildren(false);
			this.Body.setScale(0.5F, 0.5F, 0.5F);
			this.Head.setScale(1.5F, 1.5F, 1.5F);
			this.Beak.setScale(0.75F, 0.75F, 0.75F);
			this.Quill_L.setScale(2F, 2F, 2F);
			this.Quill_R.setScale(2F, 2F, 2F);
			this.Body.setRotationPoint(0.0F, 18.0F, 4.0F);
		} else {
			this.Body.setScale(1, 1, 1);
			this.Head.setScale(1, 1, 1);
			this.Quill_L.setScale(1, 1, 1);
			this.Quill_R.setScale(1, 1, 1);
		}
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.Body.render(f5);
	}

	public void renderStatue() {
		this.resetToDefaultPose();
		if (this.isChild) {
			this.Body.setShouldScaleChildren(true);
			this.Head.setShouldScaleChildren(false);
			this.Body.setScale(0.5F, 0.5F, 0.5F);
			this.Head.setScale(1.5F, 1.5F, 1.5F);
			this.Beak.setScale(0.75F, 0.75F, 0.75F);
			this.Quill_L.setScale(2F, 2F, 2F);
			this.Quill_R.setScale(2F, 2F, 2F);
			this.Body.setRotationPoint(0.0F, 18.0F, 4.0F);
		} else {
			this.Body.setScale(1, 1, 1);
			this.Head.setScale(1, 1, 1);
		}
		this.Body.render(0.0625F);
		this.NoseBand.isHidden = true;
		this.ReinL.isHidden = true;
		this.ReinR.isHidden = true;
		this.ChestL.isHidden = true;
		this.ChestR.isHidden = true;
		this.Saddle.isHidden = true;
		this.Saddleback.isHidden = true;
		this.StirrupIronL.isHidden = true;
		this.StirrupIronR.isHidden = true;
		this.SaddleFront.isHidden = true;
		this.StirrupL.isHidden = true;
		this.StirrupR.isHidden = true;
	}

	public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.resetToDefaultPose();
		animator.update(entity);
		animator.setAnimation(EntityHippogryph.ANIMATION_SPEAK);
		animator.startKeyframe(10);
		this.rotate(animator, Head, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);

		animator.setAnimation(EntityHippogryph.ANIMATION_EAT);
		animator.startKeyframe(10);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, Head, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, BackLegR1, -10, 0, 0);
		this.rotate(animator, BackLegR1_1, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.move(BackLegR1, 0, -2F, 0.5F);
		animator.move(BackLegR1_1, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, Head, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, BackLegR1, -10, 0, 0);
		this.rotate(animator, BackLegR1_1, -10, 0, 0);
		this.rotate(animator, Jaw, 0, 0, 0);
		animator.move(BackLegR1, 0, -2F, 0.5F);
		animator.move(BackLegR1_1, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, 10, 0, 0);
		this.rotate(animator, Neck, 45, 0, 0);
		this.rotate(animator, Neck2, 35, 0, 0);
		this.rotate(animator, Head, -50, 0, 0);
		this.rotate(animator, HindThighR, -10, 0, 0);
		this.rotate(animator, HindThighL, -10, 0, 0);
		this.rotate(animator, BackLegR1, -10, 0, 0);
		this.rotate(animator, BackLegR1_1, -10, 0, 0);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.move(BackLegR1, 0, -2F, 0.5F);
		animator.move(BackLegR1_1, 0, -2F, 0.5F);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityHippogryph.ANIMATION_BITE);
		animator.startKeyframe(5);
		this.rotate(animator, Neck, -15, 0, 0);
		this.rotate(animator, Neck2, -15, 0, 0);
		this.rotate(animator, Head, 23, 0, 0);
		animator.move(HeadPivot, 0, -3F, -0.5F);
		this.rotate(animator, Jaw, 20, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Neck, 35, 0, 0);
		this.rotate(animator, Neck2, 10, 0, 0);
		this.rotate(animator, Head, -55, 0, 0);
		this.rotate(animator, Jaw, 45, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Neck, 35, 0, 0);
		this.rotate(animator, Neck2, 10, 0, 0);
		this.rotate(animator, Head, -75, 0, 0);
		this.rotate(animator, Jaw, 5, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
		animator.setAnimation(EntityHippogryph.ANIMATION_SCRATCH);
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, Head, 5, 0, 0);
		this.rotate(animator, BackLegR1, -50, 0, 0);
		this.rotate(animator, BackLegR1_1, 50, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, Head, 5, 0, 0);
		this.rotate(animator, BackLegR1, 50, 0, 0);
		this.rotate(animator, BackLegR1_1, -50, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, Head, 5, 0, 0);
		this.rotate(animator, BackLegR1, -50, 0, 0);
		this.rotate(animator, BackLegR1_1, 50, 0, 0);
		animator.endKeyframe();
		animator.startKeyframe(5);
		this.rotate(animator, Body, -35, 0, 0);
		this.rotate(animator, HindThighR, 35, 0, 0);
		this.rotate(animator, HindThighL, 35, 0, 0);
		this.rotate(animator, Neck, 10, 0, 0);
		this.rotate(animator, Neck2, 20, 0, 0);
		this.rotate(animator, Head, 5, 0, 0);
		this.rotate(animator, BackLegR1, 50, 0, 0);
		this.rotate(animator, BackLegR1_1, -50, 0, 0);
		animator.endKeyframe();
		animator.resetKeyframe(5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		EntityHippogryph hippo = (EntityHippogryph) entity;

		if (this.isChild) {
			this.progressPosition(Body, hippo.sitProgress, 0, 16, 0);
		} else {
			this.progressPosition(Body, hippo.sitProgress, 0, 18, 0);
		}
		{
			float sitProgress = Math.max(hippo.hoverProgress, hippo.flyProgress);
			progressRotation(Beak, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(HindLegR, sitProgress, -0.17453292519943295F, 0.0F, 0.0F);
			progressRotation(FingerR3, sitProgress, 0.40142572795869574F, 0.0F, 0.0F);
			progressRotation(FingerL1, sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
			progressRotation(SaddleFront, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Jaw, sitProgress, -0.045553093477052F, 0.0F, 0.0F);
			progressRotation(FingerL4, sitProgress, 0.6981317007977318F, 0.0F, 0.0F);
			progressRotation(WingL, sitProgress, 0.08726646259971647F, 0.0F, -1.3962634015954636F);
			progressRotation(ToeR2_1, sitProgress, 0.45378560551852565F, -0.45378560551852565F, -0.45378560551852565F);
			progressRotation(FingerR2, sitProgress, 0.22689280275926282F, 0.0F, 0.0F);
			progressRotation(ToeR3_1, sitProgress, 0.45378560551852565F, 0.0F, 0.0F);
			progressRotation(FingerR1, sitProgress, 0.03490658503988659F, 0.0F, 0.0F);
			progressRotation(StirrupR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(BackLegR1_1, sitProgress, 0.6981317007977318F, 0.0F, 0.0F);
			progressRotation(Crest1, sitProgress, -2.4586453172844123F, 0.0F, 0.0F);
			progressRotation(ChestL, sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
			progressRotation(Crest1_1, sitProgress, -2.231054382824351F, 0.0F, 0.0F);
			progressRotation(WingL3, sitProgress, 0.5235987755982988F, 0.0F, 0.0F);
			progressRotation(BackLegR1, sitProgress, 0.6981317007977318F, 0.0F, 0.0F);
			progressRotation(HindLegL, sitProgress, -0.17453292519943295F, 0.0F, 0.0F);
			progressRotation(HindThighR, sitProgress, 0.767944870877505F, 0.0F, 0.0F);
			progressRotation(Body, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Quill_R, sitProgress, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
			progressRotation(Neck2, sitProgress, -0.5918411493512771F, 0.0F, 0.0F);
			progressRotation(WingL21, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ReinL, sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
			progressRotation(FingerL3, sitProgress, 0.40142572795869574F, 0.0F, 0.0F);
			progressRotation(ToeR1, sitProgress, -0.767944870877505F, 3.141592653589793F, 0.0F);
			progressRotation(Saddleback, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(WingR2, sitProgress, -0.3490658503988659F, 0.0F, 0.17453292519943295F);
			progressRotation(ToeL4, sitProgress, 0.45378560551852565F, 0.45378560551852565F, 0.45378560551852565F);
			progressRotation(WingL2, sitProgress, -0.3490658503988659F, 0.0F, -0.17453292519943295F);
			progressRotation(ReinR, sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
			progressRotation(ToeR3, sitProgress, 0.45378560551852565F, 0.0F, 0.0F);
			progressRotation(FingerR4, sitProgress, 0.6981317007977318F, 0.0F, 0.0F);
			progressRotation(Beak2, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(WingR, sitProgress, 0.08726646259971647F, 0.0F, 1.3962634015954636F);
			progressRotation(ChestR, sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
			progressRotation(ToeL4_1, sitProgress, 0.45378560551852565F, 0.45378560551852565F, 0.45378560551852565F);
			progressRotation(Saddle, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(NoseBand, sitProgress, 0.091106186954104F, 0.0F, 0.0F);
			progressRotation(StirrupIronR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Tail3, sitProgress, 0.27314402793711257F, 0.0F, 0.0F);
			progressRotation(FingerL2, sitProgress, 0.22689280275926282F, 0.0F, 0.0F);
			progressRotation(WingR3, sitProgress, 0.5235987755982988F, 0.0F, 0.0F);
			progressRotation(ToeR1_1, sitProgress, -0.767944870877505F, 3.141592653589793F, 0.0F);
			progressRotation(StirrupL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Tail1, sitProgress, -0.7285004297824331F, 0.0F, 0.0F);
			progressRotation(BackLegR2_1, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
			progressRotation(StirrupIronL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeR2, sitProgress, 0.45378560551852565F, -0.45378560551852565F, -0.45378560551852565F);
			progressRotation(HindFootR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(HindThighL, sitProgress, 0.767944870877505F, 0.0F, 0.0F);
			progressRotation(BackLegR2, sitProgress, -1.3962634015954636F, 0.0F, 0.0F);
			progressRotation(WingR21, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Neck, sitProgress, 1.1838568316277536F, 0.0F, 0.0F);
			progressRotation(BeakTip, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Tail2, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(HeadPivot, sitProgress, -0.136659280431156F, 0.0F, 0.0F);
			progressRotation(Quill_L, sitProgress, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
			progressRotation(HindFootL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressPositionPrev(HindThighL, sitProgress, 0, -0.75F, 0);
			progressPositionPrev(HindThighR, sitProgress, 0, -0.75F, 0);
		}
		{
			float sitProgress = hippo.sitProgress;
			progressRotation(HeadPivot, sitProgress, -0.136659280431156F, 0.0F, 0.0F);
			progressRotation(HindLegR, sitProgress, 1.5481070465189704F, 0.0F, 0.0F);
			progressRotation(FingerL4, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(StirrupL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeR1_1, sitProgress, -2.443460952792061F, 3.141592653589793F, 0.0F);
			progressRotation(Jaw, sitProgress, -0.045553093477052F, 0.0F, 0.0F);
			progressRotation(BackLegR2_1, sitProgress, -2.1399481958702475F, 0.0F, 0.0F);
			progressRotation(ToeR2_1, sitProgress, -0.22689280275926282F, -0.22689280275926282F, -0.3490658503988659F);
			progressRotation(ReinR, sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
			progressRotation(StirrupR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeR1, sitProgress, -2.443460952792061F, 3.141592653589793F, 0.0F);
			progressRotation(ToeR3, sitProgress, -0.2617993877991494F, 0.0F, 0.0F);
			progressRotation(BackLegR1_1, sitProgress, 1.1383037381507017F, 0.0F, 0.0F);
			progressRotation(WingL21, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(BeakTip, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Tail2, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(FingerR3, sitProgress, 0.08726646259971647F, 0.0F, 0.0F);
			progressRotation(Head, sitProgress, 0.36425021489121656F, 0.0F, 0.0F);
			progressRotation(BackLegR1, sitProgress, 1.1838568316277536F, 0.0F, 0.0F);
			progressRotation(HindFootR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(FingerL1, sitProgress, 0.12217304763960307F, 0.0F, 0.0F);
			progressRotation(FingerL3, sitProgress, 0.08726646259971647F, 0.0F, 0.0F);
			progressRotation(WingR21, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeL4, sitProgress, -0.22689280275926282F, 0.22689280275926282F, 0.3490658503988659F);
			progressRotation(HindLegL, sitProgress, 1.5481070465189704F, 0.0F, 0.0F);
			progressRotation(Saddleback, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(FingerR1, sitProgress, 0.12217304763960307F, 0.0F, 0.0F);
			progressRotation(WingR, sitProgress, -0.2617993877991494F, -0.2617993877991494F, 0.45378560551852565F);
			progressRotation(WingR2, sitProgress, 1.5481070465189704F, 0.0F, 0.17453292519943295F);
			progressRotation(NoseBand, sitProgress, 0.091106186954104F, 0.0F, 0.0F);
			progressRotation(WingL, sitProgress, -0.2617993877991494F, 0.2617993877991494F, -0.45378560551852565F);
			progressRotation(FingerL2, sitProgress, 0.10471975511965977F, 0.0F, 0.0F);
			progressRotation(ReinL, sitProgress, -0.04363323129985824F, 0.0F, 0.0F);
			progressRotation(WingL3, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Tail3, sitProgress, -0.3490658503988659F, 0.0F, 0.0F);
			progressRotation(Saddle, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(FingerR2, sitProgress, 0.10471975511965977F, 0.0F, 0.0F);
			progressRotation(HindThighL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(WingR3, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Neck2, sitProgress, -0.6829473363053812F, 0.0F, 0.0F);
			progressRotation(StirrupIronR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Body, sitProgress, 0.045553093477052F, 0.0F, 0.0F);
			progressRotation(Neck, sitProgress, 0.7740535232594852F, 0.0F, 0.0F);
			progressRotation(Tail1, sitProgress, -1.1344640137963142F, 0.0F, 0.0F);
			progressRotation(ToeR3_1, sitProgress, -0.2617993877991494F, 0.0F, 0.0F);
			progressRotation(ChestR, sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
			progressRotation(SaddleFront, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeL4_1, sitProgress, -0.22689280275926282F, 0.22689280275926282F, 0.3490658503988659F);
			progressRotation(WingL2, sitProgress, 1.5481070465189704F, 0.0F, -0.17453292519943295F);
			progressRotation(Crest1_1, sitProgress, -2.231054382824351F, 0.0F, 0.0F);
			progressRotation(ChestL, sitProgress, 0.0F, 1.5707963267948966F, 0.0F);
			progressRotation(Quill_L, sitProgress, -1.1838568316277536F, 0.17453292519943295F, 0.0F);
			progressRotation(Quill_R, sitProgress, -1.1838568316277536F, -0.17453292519943295F, 0.0F);
			progressRotation(StirrupIronL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(BackLegR2, sitProgress, -2.1399481958702475F, 0.0F, 0.0F);
			progressRotation(Beak2, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(Crest1, sitProgress, -2.4586453172844123F, 0.0F, 0.0F);
			progressRotation(Beak, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(FingerR4, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(HindFootL, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(HindThighR, sitProgress, 0.0F, 0.0F, 0.0F);
			progressRotation(ToeR2, sitProgress, -0.22689280275926282F, -0.22689280275926282F, -0.3490658503988659F);
			progressPositionPrev(HindThighL, sitProgress, 0, -0.75F, 0);
			progressPositionPrev(HindThighR, sitProgress, 0, -0.75F, 0);

		}


		float speed_walk = 0.4F;
		float speed_idle = 0.05F;
		float speed_fly = 0.35F + (hippo.getEnumVariant() == EnumHippogryphTypes.DODO ? 0.2f : 0);
		float degree_walk = 0.5F;
		float degree_idle = 0.5F;
		float degree_fly = 0.5F + (hippo.getEnumVariant() == EnumHippogryphTypes.DODO ? 1f : 0);
		this.bob(Body, speed_idle, degree_idle, false, f2, 1);
		this.bob(BackLegR1, -speed_idle, degree_idle, false, f2, 1);
		this.bob(BackLegR1_1, -speed_idle, degree_idle, false, f2, 1);
		this.bob(HindThighR, -speed_idle, degree_idle, false, f2, 1);
		this.bob(HindThighL, -speed_idle, degree_idle, false, f2, 1);
		AdvancedModelRenderer[] NECK = new AdvancedModelRenderer[]{Neck, Neck2, Head};
		this.chainWave(NECK, speed_idle, degree_idle * 0.15F, -2, f2, 1);

		if (hippo.isFlying() || hippo.airBorneCounter > 50 || hippo.isHovering()) {
			//hippo.roll_buffer.applyChainFlapBuffer(Body);
			this.flap(WingL, speed_fly, degree_fly, false, 0, 0, f2, 1);
			this.flap(WingR, speed_fly, -degree_fly, false, 0, 0, f2, 1);
			this.flap(WingL2, speed_fly, degree_fly, false, 0, 0, f2, 1);
			this.flap(WingR2, speed_fly, -degree_fly, false, 0, 0, f2, 1);
		} else {
			this.faceTarget(f3, f4, 3, NECK);
			this.bob(Body, speed_walk, degree_walk, false, f, f1);
			this.bob(BackLegR1, -speed_walk, degree_walk, false, f, f1);
			this.bob(BackLegR1_1, -speed_walk, degree_walk, false, f, f1);
			this.bob(HindThighR, -speed_walk, degree_walk, false, f, f1);
			this.bob(HindThighL, -speed_walk, degree_walk, false, f, f1);
			this.chainWave(NECK, speed_walk, degree_walk * 0.15F, -2, f, f1);
			this.walk(BackLegR1, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
			this.walk(BackLegR1_1, speed_walk, degree_walk * -0.75F, false, 0, 0F, f, f1);
			this.walk(BackLegR2, speed_walk, degree_walk * 0.5F, false, 0, 0F, f, f1);
			this.walk(BackLegR2_1, speed_walk, degree_walk * 0.5F, true, 0, 0F, f, f1);
			this.walk(HindThighR, speed_walk, degree_walk * -0.75F, false, 0, 0F, f, f1);
			this.walk(HindThighL, speed_walk, degree_walk * -0.75F, true, 0, 0F, f, f1);
			this.walk(HindLegR, speed_walk, degree_walk * 0.5F, true, 0, 0F, f, f1);
			this.walk(HindLegL, speed_walk, degree_walk * 0.5F, false, 0, 0F, f, f1);
			this.walk(HindFootR, -speed_walk, degree_walk, true, 2.75F, 0F, f, f1);
			this.walk(HindFootL, -speed_walk, degree_walk, false, 2.75F, 0F, f, f1);
		}

		float f12 = -1.1344640137963142F + f1;
		if (f12 > 0.0F) {
			f12 = 0.0F;
		}

		if (f12 < Math.toRadians(-80)) {
			f12 = (float) Math.toRadians(-80);
		}
		this.Tail1.rotateAngleX = f12;
		f12 = 0.0F;
	}
}
