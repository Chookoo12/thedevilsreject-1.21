package net.chookoo.thedevilsreject;

import net.chookoo.thedevilsreject.block.ModBlocks;
import net.chookoo.thedevilsreject.item.ModItemGroups;
import net.chookoo.thedevilsreject.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thedevilsreject implements ModInitializer {
	public static final String MOD_ID = "thedevilsreject";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}