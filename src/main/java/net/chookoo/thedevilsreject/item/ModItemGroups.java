package net.chookoo.thedevilsreject.item;

import net.chookoo.thedevilsreject.Thedevilsreject;
import net.chookoo.thedevilsreject.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup THE_DEVILS_REJECT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Thedevilsreject.MOD_ID, "the_devils_reject_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.QUESTION_MARK))
                    .displayName(Text.translatable("itemgroup.thedevilsreject.the_devils_reject_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.QUESTION_MARK);
                        entries.add(ModItems.MYSTERIOUS_SHAFT);

                        entries.add(ModBlocks.QUESTION_MARK_BLOCK);

                        entries.add(ModBlocks.QUESTION_MARK_BLOCK2);

                    }).build());



    public static void registerItemGroups(){
        Thedevilsreject.LOGGER.info("Registering Item Groups for " + Thedevilsreject.MOD_ID);
    }
}
