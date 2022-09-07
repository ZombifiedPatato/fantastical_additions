package com.github.zombifiedpotato.fantastical_additions.particle;

import com.github.zombifiedpotato.fantastical_additions.Main;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModParticles {

    public static final DefaultParticleType PINK_SMOKE = Registry.register(
            Registry.PARTICLE_TYPE, new Identifier(Main.MOD_ID, "pink_smoke"), FabricParticleTypes.simple(true));

    public static void registerModParticles() {
        System.out.println("Registering Mod Particles for " + Main.MOD_ID);
    }
}
