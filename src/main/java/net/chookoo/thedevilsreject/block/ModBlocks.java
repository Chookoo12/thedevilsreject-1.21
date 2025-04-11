package net.chookoo.thedevilsreject.block;

import net.chookoo.thedevilsreject.Thedevilsreject;
import net.chookoo.thedevilsreject.block.custom.QuestionMarkBlock2;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModBlocks {
    public static Block QUESTION_MARK_BLOCK = registerBlock("question_mark_block",
            new Block(AbstractBlock.Settings.create().breakInstantly()
                    .sounds(BlockSoundGroup.SNOW)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.thedevilsreject.question_mark_block.tooltip"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            });



    public static final Block QUESTION_MARK_BLOCK2 = registerBlock("question_mark_block2",
            new QuestionMarkBlock2(AbstractBlock.Settings.create().strength(-1.0f)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Thedevilsreject.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Thedevilsreject.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Thedevilsreject.LOGGER.info("Registering Mod Blocks for " + Thedevilsreject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(ModBlocks.QUESTION_MARK_BLOCK);
        });
    }
}
