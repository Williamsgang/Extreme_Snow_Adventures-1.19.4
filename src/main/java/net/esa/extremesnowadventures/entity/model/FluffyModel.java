package net.esa.extremesnowadventures.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class FluffyModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart fluffy;

	public FluffyModel(ModelPart root) {
		this.fluffy = root.getChild("fluffy");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fluffy = partdefinition.addOrReplaceChild("fluffy", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = fluffy.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 39).addBox(-8.0F, -76.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(88, 57).addBox(-3.0F, -66.0F, -9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-1.0F, -69.0F, -9.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(-2.0F, -67.0F, -9.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(1.0F, -67.0F, -9.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 57).addBox(2.0F, -66.0F, -9.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create().texOffs(0, 112).addBox(-13.0F, -76.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(36, 71).addBox(8.0F, -76.0F, -2.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = horns.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(77, 118).addBox(24.0F, -111.0F, -52.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(119, 15).addBox(3.0F, -111.0F, -52.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 62).addBox(2.0F, -112.0F, -53.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(120, 7).addBox(1.0F, -111.0F, -52.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(100, 89).addBox(2.0F, -110.0F, -51.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 46).addBox(2.0F, -111.0F, -56.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(73, 57).addBox(23.0F, -110.0F, -51.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(85, 117).addBox(22.0F, -111.0F, -52.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(90, 57).addBox(23.0F, -112.0F, -53.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 39).addBox(23.0F, -111.0F, -56.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0F, 44.0F, -19.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r2 = horns.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 57).addBox(22.0F, -114.0F, -32.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(70, 109).addBox(22.0F, -117.0F, -35.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(62, 0).addBox(43.0F, -117.0F, -35.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 57).addBox(43.0F, -114.0F, -32.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0F, 44.0F, -19.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r3 = horns.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(63, 102).addBox(21.0F, -117.0F, -6.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(110, 22).addBox(21.0F, -121.0F, -9.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(102, 0).addBox(42.0F, -117.0F, -6.0F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(94, 28).addBox(42.0F, -121.0F, -9.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0F, 44.0F, -19.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tusks = head.addOrReplaceChild("tusks", CubeListBuilder.create().texOffs(36, 71).addBox(-4.0F, -64.0F, -9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 71).addBox(3.0F, -64.0F, -9.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = fluffy.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -60.0F, -5.0F, 26.0F, 29.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftarm = body.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(100, 47).addBox(13.0F, -60.0F, -5.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = leftarm.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 92).addBox(13.0F, -28.0F, -19.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition lefthand = leftarm.addOrReplaceChild("lefthand", CubeListBuilder.create().texOffs(46, 102).addBox(19.0F, -51.6795F, 32.0F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(41, 116).addBox(20.0F, -44.6795F, 38.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 67).addBox(20.0F, -44.6795F, 32.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 33).addBox(20.0F, -44.6795F, 36.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 18).addBox(20.0F, -44.6795F, 34.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -3.0F, -63.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r5 = lefthand.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 46).addBox(-11.8666F, -46.7317F, 34.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(74, 0).addBox(-11.8666F, -46.7317F, 36.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 120).addBox(-16.8666F, -49.7317F, 32.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 39).addBox(-11.8666F, -46.7317F, 32.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 13).addBox(-11.8666F, -46.7317F, 38.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r6 = lefthand.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(62, 0).addBox(14.7555F, -47.696F, 32.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition rightarm = body.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(72, 0).addBox(-23.0F, -60.0F, -5.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = rightarm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(64, 29).addBox(13.0F, -28.0F, -19.0F, 10.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -13.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition righthand = rightarm.addOrReplaceChild("righthand", CubeListBuilder.create().texOffs(100, 75).addBox(-17.5638F, -51.6795F, 12.0095F, 5.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(120, 89).addBox(-16.5638F, -44.6795F, 18.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 116).addBox(-16.5638F, -44.6795F, 12.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 120).addBox(-16.5638F, -44.6795F, 16.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(116, 43).addBox(-16.5638F, -44.6795F, 14.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-34.0F, 24.0F, -19.0F, -2.6176F, -0.0378F, 3.1198F));

		PartDefinition cube_r8 = righthand.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 112).addBox(-11.5324F, -47.0121F, 14.0095F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 112).addBox(-11.5324F, -47.0121F, 16.0095F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(92, 120).addBox(-16.5324F, -50.0121F, 18.0095F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 112).addBox(-11.5324F, -47.0121F, 12.0095F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(115, 38).addBox(-11.5324F, -47.0121F, 18.0095F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-37.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r9 = righthand.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 39).addBox(15.1913F, -47.715F, 18.0095F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-37.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition furarms = body.addOrReplaceChild("furarms", CubeListBuilder.create().texOffs(116, 120).addBox(23.0F, -60.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 120).addBox(23.0F, -60.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(112, 120).addBox(23.0F, -60.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(108, 120).addBox(23.0F, -60.0F, -2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 117).addBox(23.0F, -60.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Furarms2 = furarms.addOrReplaceChild("Furarms2", CubeListBuilder.create().texOffs(112, 22).addBox(-24.0F, -60.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 120).addBox(-24.0F, -60.0F, 2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(70, 109).addBox(-24.0F, -60.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 93).addBox(-24.0F, -60.0F, -2.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 117).addBox(-24.0F, -60.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Furarms3 = furarms.addOrReplaceChild("Furarms3", CubeListBuilder.create(), PartPose.offset(-36.0F, -33.0F, 0.0F));

		PartDefinition cube_r10 = Furarms3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(79, 102).addBox(18.0F, -25.0F, -20.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 117).addBox(21.0F, -25.0F, -20.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 102).addBox(17.0F, -25.0F, -20.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 116).addBox(14.0F, -25.0F, -20.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition Furarms4 = Furarms3.addOrReplaceChild("Furarms4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Furarms4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(63, 102).addBox(18.0F, -25.0F, -20.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(57, 116).addBox(21.0F, -25.0F, -20.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(100, 75).addBox(17.0F, -25.0F, -20.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 116).addBox(14.0F, -25.0F, -20.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(36.0F, 20.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition legs = fluffy.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition furlegs = legs.addOrReplaceChild("furlegs", CubeListBuilder.create().texOffs(50, 80).addBox(-1.0F, -31.0F, -6.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(104, 45).addBox(-7.0F, -31.0F, -6.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(52, 39).addBox(-5.0F, -31.0F, -6.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 122).addBox(-3.0F, -31.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(88, 121).addBox(-9.0F, -31.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(73, 118).addBox(-11.0F, -31.0F, -6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fur2 = furlegs.addOrReplaceChild("Fur2", CubeListBuilder.create().texOffs(69, 118).addBox(11.0F, -31.0F, -6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 102).addBox(5.0F, -31.0F, -6.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(60, 39).addBox(7.0F, -31.0F, -6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 121).addBox(9.0F, -31.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 121).addBox(3.0F, -31.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(102, 0).addBox(1.0F, -31.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fur3 = furlegs.addOrReplaceChild("Fur3", CubeListBuilder.create().texOffs(46, 80).addBox(-1.0F, -31.0F, 5.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(50, 92).addBox(-7.0F, -31.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 39).addBox(-5.0F, -31.0F, 5.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(8, 121).addBox(-3.0F, -31.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 121).addBox(-9.0F, -31.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(34, 117).addBox(-11.0F, -31.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Fur4 = Fur3.addOrReplaceChild("Fur4", CubeListBuilder.create().texOffs(30, 117).addBox(11.0F, -31.0F, 5.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 92).addBox(5.0F, -31.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(56, 39).addBox(7.0F, -31.0F, 5.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 121).addBox(9.0F, -31.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(120, 120).addBox(3.0F, -31.0F, 5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(94, 28).addBox(1.0F, -31.0F, 5.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftleg = legs.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 71).addBox(0.0F, -31.0F, -5.0F, 13.0F, 31.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftfoot = leftleg.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(112, 7).addBox(1.0F, -2.0F, -9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(118, 0).addBox(5.0F, -2.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(56, 52).addBox(7.0F, -2.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 76).addBox(3.0F, -2.0F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition rightleg = legs.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(54, 61).addBox(-13.0F, -31.0F, -5.0F, 13.0F, 31.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rightfoot = rightleg.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, 0.0F));

		PartDefinition cube_r12 = rightfoot.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 7).addBox(7.0F, 20.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(117, 75).addBox(5.0F, 20.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 71).addBox(3.0F, 20.0F, -8.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(104, 39).addBox(1.0F, 20.0F, -9.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 20.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fluffy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}