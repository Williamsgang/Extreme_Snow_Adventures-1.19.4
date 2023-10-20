package net.esa.extremesnowadventures.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class YetiModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart yeti;

	public YetiModel(ModelPart root) {
		this.yeti = root.getChild("yeti");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition yeti = partdefinition.addOrReplaceChild("yeti", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = yeti.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition upperbody = body.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head = upperbody.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, -9.4444F, -6.2222F, 12.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 29).addBox(-8.0F, -9.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(42, 43).addBox(-9.0F, -10.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(18, 40).addBox(-10.0F, -11.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(39, 0).addBox(6.0F, -9.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.0F, -10.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 20).addBox(8.0F, -11.4444F, -2.2222F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(2.0F, -2.4444F, 3.7778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 1).addBox(-3.0F, -2.4444F, 3.7778F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -30.5556F, -2.7778F));

		PartDefinition torso = upperbody.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -14.0F, -3.0F, 16.0F, 13.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(34, 20).addBox(-8.0F, -17.0F, -3.0F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(38, 34).addBox(-8.0F, -1.0F, -3.0F, 16.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.0F, -5.0F));

		PartDefinition leftarm = upperbody.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 40).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -26.5F, -5.0F));

		PartDefinition rightarm = upperbody.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(24, 43).addBox(-3.0F, -2.5F, -3.0F, 6.0F, 17.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, -26.5F, -5.0F));

		PartDefinition rightleg = body.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(46, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -11.0F, -5.0F));

		PartDefinition leftleg = body.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(48, 43).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -11.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		yeti.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}