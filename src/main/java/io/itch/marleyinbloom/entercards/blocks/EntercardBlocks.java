package io.itch.marleyinbloom.entercards.blocks;

import io.itch.marleyinbloom.entercards.Entercards;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntercardBlocks {

    public static final Block SOLID_MYSTERIOSITY = registerBlock("solid_mysteriosity", 
        new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));

    public static void addToNatureTab(FabricItemGroupEntries entries) {
        entries.add(SOLID_MYSTERIOSITY);
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Entercards.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Entercards.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Entercards.LOGGER.info("Registering blocks for " + Entercards.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(EntercardBlocks::addToNatureTab);
    }
}
