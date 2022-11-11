package com.github.zombifiedpotato.fantastical_additions;

import com.github.zombifiedpotato.fantastical_additions.block.ModBlocks;
import com.github.zombifiedpotato.fantastical_additions.effect.ModEffects;
import com.github.zombifiedpotato.fantastical_additions.entity.ModEntities;
import com.github.zombifiedpotato.fantastical_additions.item.ModItems;
import com.github.zombifiedpotato.fantastical_additions.particle.ModParticles;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "fantastical_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("fantastical_additions is starting! Are you ready for magic?");
		ModEffects.registerEffects();
		ModBlocks.registerBlocks();
		ModEntities.registerModEntities();
		ModItems.registerModItems();
		ModParticles.registerModParticles();
	}
}
