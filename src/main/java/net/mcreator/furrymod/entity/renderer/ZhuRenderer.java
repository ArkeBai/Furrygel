
package net.mcreator.furrymod.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.furrymod.entity.ZhuEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ZhuRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ZhuEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelzhu(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("furrymod:textures/zhu.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelzhu extends EntityModel<Entity> {
		private final ModelRenderer ZHU;
		private final ModelRenderer foot;
		private final ModelRenderer RIGHT_FOOT2_r1;
		private final ModelRenderer body2;
		private final ModelRenderer RIGHT_FOOT1;
		private final ModelRenderer LEFT_FOOT2;
		private final ModelRenderer LEFT_FOOT_r1;
		private final ModelRenderer RIGHT_FOOT2;
		private final ModelRenderer RIGHT_FOOT_r1;
		private final ModelRenderer LEFT_FOOT1;
		private final ModelRenderer LEFT_HAND;
		private final ModelRenderer RIGHT_HAND;
		private final ModelRenderer HAND;
		private final ModelRenderer BODY;
		private final ModelRenderer BODY3;
		private final ModelRenderer clothes;
		private final ModelRenderer clothes2;
		private final ModelRenderer clothes3;
		private final ModelRenderer clothes4;
		private final ModelRenderer clothes5;
		private final ModelRenderer clothes6;
		private final ModelRenderer clothes7;
		private final ModelRenderer tail;
		private final ModelRenderer tail2;
		private final ModelRenderer tail3;
		private final ModelRenderer tail4;
		private final ModelRenderer parts;
		private final ModelRenderer horns;
		private final ModelRenderer horns_left;
		private final ModelRenderer horns_right;
		private final ModelRenderer ear_left;
		private final ModelRenderer ear_right;
		private final ModelRenderer hair;
		private final ModelRenderer hair2;
		private final ModelRenderer hair3;
		private final ModelRenderer hair4;
		private final ModelRenderer hair5;
		private final ModelRenderer hair6;
		private final ModelRenderer hair7;
		private final ModelRenderer hair8;
		private final ModelRenderer hair9;
		private final ModelRenderer hair10;
		private final ModelRenderer hair11;
		private final ModelRenderer hair12;
		private final ModelRenderer hair13;
		private final ModelRenderer hair14;

		public Modelzhu() {
			textureWidth = 78;
			textureHeight = 93;
			ZHU = new ModelRenderer(this);
			ZHU.setRotationPoint(0.0F, 24.0F, 0.0F);
			foot = new ModelRenderer(this);
			foot.setRotationPoint(0.0F, 0.0F, 0.0F);
			ZHU.addChild(foot);
			RIGHT_FOOT2_r1 = new ModelRenderer(this);
			RIGHT_FOOT2_r1.setRotationPoint(0.0F, 0.1218F, -0.9631F);
			foot.addChild(RIGHT_FOOT2_r1);
			setRotationAngle(RIGHT_FOOT2_r1, 0.1745F, 0.0F, 0.0F);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 0.0F, 0.0F);
			ZHU.addChild(body2);
			RIGHT_FOOT1 = new ModelRenderer(this);
			RIGHT_FOOT1.setRotationPoint(-2.0F, -11.0F, 0.0F);
			body2.addChild(RIGHT_FOOT1);
			RIGHT_FOOT1.setTextureOffset(14, 75).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LEFT_FOOT2 = new ModelRenderer(this);
			LEFT_FOOT2.setRotationPoint(2.0F, -0.8782F, -0.9631F);
			body2.addChild(LEFT_FOOT2);
			LEFT_FOOT_r1 = new ModelRenderer(this);
			LEFT_FOOT_r1.setRotationPoint(-2.0F, 1.0F, 0.0F);
			LEFT_FOOT2.addChild(LEFT_FOOT_r1);
			setRotationAngle(LEFT_FOOT_r1, 0.1745F, 0.0F, 0.0F);
			LEFT_FOOT_r1.setTextureOffset(52, 62).addBox(0.2F, -1.3F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			RIGHT_FOOT2 = new ModelRenderer(this);
			RIGHT_FOOT2.setRotationPoint(-2.0F, -0.8782F, -0.9631F);
			body2.addChild(RIGHT_FOOT2);
			RIGHT_FOOT_r1 = new ModelRenderer(this);
			RIGHT_FOOT_r1.setRotationPoint(2.0F, 1.0F, 0.0F);
			RIGHT_FOOT2.addChild(RIGHT_FOOT_r1);
			setRotationAngle(RIGHT_FOOT_r1, 0.1745F, 0.0F, 0.0F);
			RIGHT_FOOT_r1.setTextureOffset(50, 72).addBox(-4.2F, -1.3F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			LEFT_FOOT1 = new ModelRenderer(this);
			LEFT_FOOT1.setRotationPoint(2.0F, -11.0F, 0.0F);
			body2.addChild(LEFT_FOOT1);
			LEFT_FOOT1.setTextureOffset(30, 75).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LEFT_HAND = new ModelRenderer(this);
			LEFT_HAND.setRotationPoint(5.0F, -23.0F, 0.0F);
			body2.addChild(LEFT_HAND);
			LEFT_HAND.setTextureOffset(38, 58).addBox(-1.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
			RIGHT_HAND = new ModelRenderer(this);
			RIGHT_HAND.setRotationPoint(-4.0F, -23.0F, 0.0F);
			body2.addChild(RIGHT_HAND);
			RIGHT_HAND.setTextureOffset(0, 58).addBox(-3.0F, -1.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);
			HAND = new ModelRenderer(this);
			HAND.setRotationPoint(0.0F, -25.0F, 0.0F);
			body2.addChild(HAND);
			HAND.setTextureOffset(46, 0).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			HAND.setTextureOffset(10, 43).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			BODY = new ModelRenderer(this);
			BODY.setRotationPoint(0.0F, 0.0F, 0.0F);
			body2.addChild(BODY);
			setRotationAngle(BODY, 0.0F, 0.0F, 0.0436F);
			BODY3 = new ModelRenderer(this);
			BODY3.setRotationPoint(0.0F, 0.0F, 0.0F);
			BODY.addChild(BODY3);
			setRotationAngle(BODY3, 0.0F, 0.0F, -0.0436F);
			BODY3.setTextureOffset(14, 47).addBox(-4.0F, -25.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			BODY3.setTextureOffset(14, 58).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			clothes = new ModelRenderer(this);
			clothes.setRotationPoint(0.0F, 1.0F, 0.0F);
			ZHU.addChild(clothes);
			clothes2 = new ModelRenderer(this);
			clothes2.setRotationPoint(0.0F, -24.0F, -2.0F);
			clothes.addChild(clothes2);
			setRotationAngle(clothes2, -0.1745F, 0.0F, 0.0F);
			clothes2.setTextureOffset(56, 42).addBox(-5.0F, -1.0F, -1.0F, 10.0F, 9.0F, 1.0F, 0.0F, false);
			clothes3 = new ModelRenderer(this);
			clothes3.setRotationPoint(4.0F, -24.0F, 0.0F);
			clothes.addChild(clothes3);
			setRotationAngle(clothes3, 0.0F, 0.0F, -0.0873F);
			clothes3.setTextureOffset(0, 34).addBox(0.0F, -1.0F, -3.0F, 1.0F, 9.0F, 6.0F, 0.0F, false);
			clothes4 = new ModelRenderer(this);
			clothes4.setRotationPoint(-4.0F, -24.0F, 0.0F);
			clothes.addChild(clothes4);
			setRotationAngle(clothes4, 0.0F, 0.0F, 0.0873F);
			clothes4.setTextureOffset(0, 78).addBox(-1.0F, -1.0F, -3.0F, 1.0F, 9.0F, 6.0F, 0.0F, false);
			clothes5 = new ModelRenderer(this);
			clothes5.setRotationPoint(0.0F, -23.0F, 2.0F);
			clothes.addChild(clothes5);
			setRotationAngle(clothes5, 0.1745F, 0.0F, 0.0F);
			clothes5.setTextureOffset(48, 52).addBox(-5.0F, -2.0F, 0.0F, 10.0F, 9.0F, 1.0F, 0.0F, false);
			clothes6 = new ModelRenderer(this);
			clothes6.setRotationPoint(-4.0F, -24.4F, 0.0F);
			clothes.addChild(clothes6);
			setRotationAngle(clothes6, 0.0F, 0.0F, 0.2182F);
			clothes6.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
			clothes7 = new ModelRenderer(this);
			clothes7.setRotationPoint(4.0F, -24.4F, 0.0F);
			clothes.addChild(clothes7);
			setRotationAngle(clothes7, 0.0F, 0.0F, -0.2182F);
			clothes7.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -3.0F, 4.0F, 7.0F, 6.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 0.0F, 0.0F);
			ZHU.addChild(tail);
			setRotationAngle(tail, 0.0F, 3.1416F, 0.0F);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, -16.2776F, -7.1113F);
			tail.addChild(tail2);
			setRotationAngle(tail2, -0.3491F, 0.0F, 0.0F);
			tail2.setTextureOffset(8, 28).addBox(-2.0F, -1.8F, -5.0F, 4.0F, 4.0F, 6.0F, 0.0F, false);
			tail3 = new ModelRenderer(this);
			tail3.setRotationPoint(0.0F, -18.1005F, -11.5197F);
			tail.addChild(tail3);
			setRotationAngle(tail3, -1.2217F, 0.0F, 0.0F);
			tail3.setTextureOffset(52, 85).addBox(-1.0F, -0.8F, -4.0F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			tail4 = new ModelRenderer(this);
			tail4.setRotationPoint(0.0F, -13.0F, -2.0F);
			tail.addChild(tail4);
			setRotationAngle(tail4, -0.1745F, 0.0F, 0.0F);
			tail4.setTextureOffset(4, 20).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			parts = new ModelRenderer(this);
			parts.setRotationPoint(0.0F, -12.0F, 0.0F);
			ZHU.addChild(parts);
			parts.setTextureOffset(38, 47).addBox(-4.0F, 0.0F, 2.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			parts.setTextureOffset(38, 47).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			parts.setTextureOffset(45, 41).addBox(-5.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			parts.setTextureOffset(45, 41).addBox(4.0F, 0.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			horns = new ModelRenderer(this);
			horns.setRotationPoint(0.0F, 0.0F, 0.0F);
			ZHU.addChild(horns);
			setRotationAngle(horns, 0.0F, 3.1416F, 0.0F);
			horns_left = new ModelRenderer(this);
			horns_left.setRotationPoint(-2.0F, -33.0F, 2.0F);
			horns.addChild(horns_left);
			setRotationAngle(horns_left, -0.7854F, -0.1745F, 0.0F);
			horns_left.setTextureOffset(69, 1).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			horns_right = new ModelRenderer(this);
			horns_right.setRotationPoint(2.0F, -33.0F, 2.0F);
			horns.addChild(horns_right);
			setRotationAngle(horns_right, -0.7854F, 0.1745F, 0.0F);
			horns_right.setTextureOffset(69, 1).addBox(0.0F, -3.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(0.0F, -25.0F, 0.0F);
			ZHU.addChild(ear_left);
			setRotationAngle(ear_left, 0.0F, 0.0F, 0.1745F);
			ear_left.setTextureOffset(26, 20).addBox(3.4023F, -6.8226F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			ear_left.setTextureOffset(32, 7).addBox(6.4023F, -5.8226F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			ear_left.setTextureOffset(22, 15).addBox(9.4023F, -3.8226F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			ear_left.setTextureOffset(28, 13).addBox(3.4023F, -4.8226F, 2.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(28, 16).addBox(4.4023F, -4.8226F, -3.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(0.0F, -25.0F, 0.0F);
			ZHU.addChild(ear_right);
			setRotationAngle(ear_right, 3.1416F, 0.0F, 2.9671F);
			ear_right.setTextureOffset(26, 20).addBox(3.4021F, -6.8225F, -2.0002F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			ear_right.setTextureOffset(32, 7).addBox(6.4021F, -5.8225F, -2.0002F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			ear_right.setTextureOffset(22, 15).addBox(9.4021F, -3.8225F, -2.0002F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			ear_right.setTextureOffset(24, 7).addBox(4.4021F, -4.8225F, 1.9998F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			ear_right.setTextureOffset(28, 13).addBox(3.4021F, -4.8225F, -3.0002F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			hair = new ModelRenderer(this);
			hair.setRotationPoint(0.0F, -25.0F, 0.0F);
			ZHU.addChild(hair);
			setRotationAngle(hair, 0.0F, 3.1416F, 0.0F);
			hair.setTextureOffset(22, 29).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 2.0F, 9.0F, 0.0F, false);
			hair.setTextureOffset(56, 37).addBox(-3.0F, -10.0F, -4.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			hair.setTextureOffset(24, 0).addBox(-5.0F, -8.0F, -6.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
			hair2 = new ModelRenderer(this);
			hair2.setRotationPoint(4.4603F, -6.6707F, 1.0F);
			hair.addChild(hair2);
			setRotationAngle(hair2, 0.0F, 0.0F, -0.0873F);
			hair2.setTextureOffset(66, 82).addBox(-0.7824F, -1.2962F, 0.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			hair3 = new ModelRenderer(this);
			hair3.setRotationPoint(0.0F, -7.7769F, -4.8925F);
			hair.addChild(hair3);
			setRotationAngle(hair3, -0.0873F, 0.0F, 0.0F);
			hair3.setTextureOffset(46, 6).addBox(-5.0F, -0.3001F, -0.1304F, 10.0F, 10.0F, 1.0F, 0.0F, false);
			hair4 = new ModelRenderer(this);
			hair4.setRotationPoint(-4.4565F, -6.7579F, 1.0F);
			hair.addChild(hair4);
			setRotationAngle(hair4, 0.0F, 0.0F, 0.0873F);
			hair4.setTextureOffset(72, 82).addBox(-0.2176F, -1.2962F, 0.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			hair5 = new ModelRenderer(this);
			hair5.setRotationPoint(3.6975F, -6.5869F, -3.0F);
			hair.addChild(hair5);
			setRotationAngle(hair5, 0.0F, 0.0F, -0.1309F);
			hair5.setTextureOffset(66, 82).addBox(-0.1769F, -1.2737F, -2.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			hair6 = new ModelRenderer(this);
			hair6.setRotationPoint(-4.689F, -6.7174F, -3.0F);
			hair.addChild(hair6);
			setRotationAngle(hair6, 0.0F, 0.0F, 0.1309F);
			hair6.setTextureOffset(72, 82).addBox(0.1683F, -1.4042F, -2.0F, 1.0F, 9.0F, 2.0F, 0.0F, false);
			hair7 = new ModelRenderer(this);
			hair7.setRotationPoint(0.0F, -5.6934F, 3.4588F);
			hair.addChild(hair7);
			setRotationAngle(hair7, 0.7418F, 0.0F, 0.0F);
			hair7.setTextureOffset(40, 18).addBox(-3.0F, -0.7373F, 1.6756F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			hair8 = new ModelRenderer(this);
			hair8.setRotationPoint(0.0F, -4.9562F, 4.1344F);
			hair.addChild(hair8);
			setRotationAngle(hair8, 0.7418F, 0.0F, 0.0F);
			hair8.setTextureOffset(40, 18).addBox(-2.0F, 0.2627F, 1.6756F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			hair9 = new ModelRenderer(this);
			hair9.setRotationPoint(0.0F, -4.5129F, 5.628F);
			hair.addChild(hair9);
			setRotationAngle(hair9, 0.1309F, 0.0F, 0.0F);
			hair9.setTextureOffset(40, 18).addBox(-1.0F, -1.1347F, 0.493F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			hair9.setTextureOffset(40, 18).addBox(-1.0F, -0.1347F, 0.493F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			hair10 = new ModelRenderer(this);
			hair10.setRotationPoint(-4.0F, -6.6821F, 2.7219F);
			hair.addChild(hair10);
			setRotationAngle(hair10, 0.0873F, 0.0F, 0.0F);
			hair10.setTextureOffset(56, 22).addBox(-1.0F, -0.1257F, 1.1228F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			hair11 = new ModelRenderer(this);
			hair11.setRotationPoint(4.0F, -7.0F, 4.0F);
			hair.addChild(hair11);
			setRotationAngle(hair11, 0.1746F, 0.0F, 0.0F);
			hair11.setTextureOffset(74, 22).addBox(0.0F, -0.0304F, -0.3474F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			hair12 = new ModelRenderer(this);
			hair12.setRotationPoint(0.0F, 26.0F, 0.0F);
			hair.addChild(hair12);
			setRotationAngle(hair12, 0.0F, 0.0F, 0.0873F);
			hair12.setTextureOffset(54, 22).addBox(-8.6872F, -32.6962F, -5.1F, 3.0F, 4.0F, 9.0F, 0.0F, false);
			hair13 = new ModelRenderer(this);
			hair13.setRotationPoint(0.0F, 26.0F, 0.0F);
			hair.addChild(hair13);
			setRotationAngle(hair13, 0.0F, 0.0F, -0.0873F);
			hair13.setTextureOffset(54, 68).addBox(5.6872F, -32.6962F, -5.1F, 3.0F, 4.0F, 9.0F, 0.0F, false);
			hair14 = new ModelRenderer(this);
			hair14.setRotationPoint(3.0F, -6.0F, 4.0F);
			hair.addChild(hair14);
			setRotationAngle(hair14, 0.4363F, 0.0F, 0.0F);
			hair14.setTextureOffset(0, 33).addBox(0.0F, -1.93F, 0.2062F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			hair14.setTextureOffset(0, 33).addBox(-7.0F, -1.93F, 0.2062F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			ZHU.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
