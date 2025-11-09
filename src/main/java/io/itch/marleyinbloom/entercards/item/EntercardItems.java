package io.itch.marleyinbloom.entercards.item;

import io.itch.marleyinbloom.entercards.Entercards;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntercardItems {

    public static final Item UNSTABLE_ENTERCARD = registerItem("unstable_entercard", new Item(new FabricItemSettings()));
    public static final Item BLANK_ENTERCARD = registerItem("blank_entercard", new Item(new FabricItemSettings()));
    public static final Item MOON_ENTERCARD = registerItem("moon_entercard", new Item(new FabricItemSettings()));
    public static final Item LESSER_MOON_ENTERCARD = registerItem("lesser_moon_entercard", new Item(new FabricItemSettings()));
    public static final Item SUN_ENTERCARD = registerItem("sun_entercard", new Item(new FabricItemSettings()));
    public static final Item LESSER_SUN_ENTERCARD = registerItem("lesser_sun_entercard", new Item(new FabricItemSettings()));

    public static final Item RESCUE_REQUEST = registerItem("rescue_request", new Item(new FabricItemSettings()));
    public static final Item WONDER_REQUEST = registerItem("wonder_request", new Item(new FabricItemSettings()));

    public static final Item ESCAPE_BADGE = registerItem("escape_badge", new Item(new FabricItemSettings()));

    public static void addToToolsTab(FabricItemGroupEntries entries) {
        entries.add(UNSTABLE_ENTERCARD);
        entries.add(BLANK_ENTERCARD);
        entries.add(MOON_ENTERCARD);
        entries.add(LESSER_MOON_ENTERCARD);
        entries.add(SUN_ENTERCARD);
        entries.add(LESSER_SUN_ENTERCARD);

        entries.add(WONDER_REQUEST);

        entries.add(ESCAPE_BADGE);
    }

    public static final Item ENTERCARD_FRAME = registerItem("entercard_frame", new Item(new FabricItemSettings()));

    public static void addToFunctionalTab(FabricItemGroupEntries entries) {
        entries.add(ENTERCARD_FRAME);
    }

    public static final Item UNSTABLE_MYSTERIOSITY_CLUMP = registerItem("unstable_mysteriosity_clump", new Item(new FabricItemSettings()));
    public static final Item MYSTERIOSITY_CLUMP = registerItem("mysteriosity_clump", new Item(new FabricItemSettings()));

    public static void addToIngredientsTab(FabricItemGroupEntries entries) {
        entries.add(UNSTABLE_MYSTERIOSITY_CLUMP);
        entries.add(MYSTERIOSITY_CLUMP);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Entercards.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Entercards.LOGGER.info("Registering items for " + Entercards.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(EntercardItems::addToToolsTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(EntercardItems::addToFunctionalTab);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(EntercardItems::addToIngredientsTab);
    }
}
