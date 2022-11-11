package com.github.zombifiedpotato.fantastical_additions.entity.client;


import com.github.zombifiedpotato.fantastical_additions.Main;
import com.github.zombifiedpotato.fantastical_additions.entity.custom.FairyPowderEntity;
import com.github.zombifiedpotato.fantastical_additions.item.ModItems;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class FairyPowderRenderer extends EntityRenderer<FairyPowderEntity> {

    public static final ItemStack STACK = new ItemStack(ModItems.FAIRY_POWDER);

    public FairyPowderRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public void render(FairyPowderEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        MinecraftClient.getInstance().getItemRenderer().renderItem(
            STACK, ModelTransformation.Mode.FIXED, light, OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getId()
        );
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(FairyPowderEntity entity) {
        return new Identifier(Main.MOD_ID, "textures/entity/fairy_powder/fairy_powder.png");
    }
}
