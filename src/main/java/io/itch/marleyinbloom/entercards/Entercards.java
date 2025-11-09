package io.itch.marleyinbloom.entercards;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.itch.marleyinbloom.entercards.blocks.EntercardBlocks;
import io.itch.marleyinbloom.entercards.item.EntercardItems;

public class Entercards implements ModInitializer {
	public static final String MOD_ID = "entercards";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		
		EntercardItems.registerModItems();
		EntercardBlocks.registerModBlocks();

	}
}