package net.chookoo.thedevilsreject.item;

import net.chookoo.thedevilsreject.Thedevilsreject;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item QUESTION_MARK = registerItem("question_mark", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.thedevilsreject.question_mark.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);

        }
    });
    public static final Item MYSTERIOUS_SHAFT = registerItem("mysterious_shaft", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.thedevilsreject.mysterious_shaft"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Thedevilsreject.MOD_ID, name), item);

    }

    public static void registerModItems() {
        Thedevilsreject.LOGGER.info("Registering Mod Items for " + Thedevilsreject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(QUESTION_MARK);
            entries.add(MYSTERIOUS_SHAFT);
        });
    }
}
