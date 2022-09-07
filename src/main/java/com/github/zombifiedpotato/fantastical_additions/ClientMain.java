package com.github.zombifiedpotato.fantastical_additions;

import com.github.zombifiedpotato.fantastical_additions.entity.ModEntities;
import com.github.zombifiedpotato.fantastical_additions.entity.client.DwarvenDynamiteRenderer;
import com.github.zombifiedpotato.fantastical_additions.entity.client.FairyPowderRenderer;
import com.github.zombifiedpotato.fantastical_additions.particle.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.CampfireSmokeParticle;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

public class ClientMain implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.FAIRY_POWDER, FairyPowderRenderer::new);
        EntityRendererRegistry.register(ModEntities.DWARVEN_DYNAMITE, DwarvenDynamiteRenderer::new);

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((((atlasTexture, registry) ->
                registry.register(new Identifier(Main.MOD_ID, "particle/pink_smoke")))));
        ParticleFactoryRegistry.getInstance().register(ModParticles.PINK_SMOKE, CampfireSmokeParticle.CosySmokeFactory::new);
    }
}
