package com.maciej916.indreb.common.tag;

import com.maciej916.indreb.IndReb;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.maciej916.indreb.IndReb.MODID;

public final class ModItemTags {

    public static final TagKey<Item> TREETAP = create("treetap");
    public static final TagKey<Item> ELECTRIC_ITEMS = create("electric_items");
    public static final TagKey<Item> BATTERY = create("battery");
    public static final TagKey<Item> WRENCH = create("wrench");
    public static final TagKey<Item> UPGRADE = create("upgrade");

    public static final TagKey<Item> HELMET = create("helmet");
    public static final TagKey<Item> CHESTPLATE = create("chestplate");
    public static final TagKey<Item> LEGGINGS = create("leggings");
    public static final TagKey<Item> BOOTS = create("boots");
    public static final TagKey<Item> CANNED_FOOD = create("canned_food");

    public static final TagKey<Item> REACTOR_COMPONENT = create("reactor_component");
    public static final TagKey<Item> REACTOR_FUSION = create("reactor_fusion");
    public static final TagKey<Item> BASIC_MACHINE_SIGN = create("basic_machine_sign");

    public static final TagKey<Item> GENERATORS = create("generators");
    public static final TagKey<Item> MACHINES = create("machines");
    public static final TagKey<Item> TRANSFORMERS = create("transformers");
    public static final TagKey<Item> BATTERY_BOXEX = create("battery_boxex");


    public static final TagKey<Item> FORGE_GLASS_PANES = create("forge", "glass_panes");
    public static final TagKey<Item> FORGE_BONES = create("forge", "bones");
    public static final TagKey<Item> FORGE_SAND = create("forge", "sand");
    public static final TagKey<Item> FORGE_GRAVEL = create("forge", "gravel");
    public static final TagKey<Item> FORGE_SLIMEBALLS = create("forge", "slimeballs");

    public static final TagKey<Item> FORGE_ORE_TIN = create("forge", "ores/tin");
    public static final TagKey<Item> FORGE_ORE_SILVER = create("forge", "ores/silver");
    public static final TagKey<Item> FORGE_ORE_URANIUM = create("forge", "ores/uranium");
    public static final TagKey<Item> FORGE_ORE_LEAD = create("forge", "ores/lead");
    public static final TagKey<Item> FORGE_ORE_GOLD = create("forge", "ores/gold");
    public static final TagKey<Item> FORGE_ORE_COPPER = create("forge", "ores/copper");
    public static final TagKey<Item> FORGE_ORE_IRON = create("forge", "ores/iron");
    public static final TagKey<Item> FORGE_ORE_REDSTONE = create("forge", "ores/redstone");
    public static final TagKey<Item> FORGE_ORE_EMERALD = create("forge", "ores/emerald");
    public static final TagKey<Item> FORGE_ORE_LAPIS = create("forge", "ores/lapis");
    public static final TagKey<Item> FORGE_ORE_DIAMOND = create("forge", "ores/diamond");
    public static final TagKey<Item> FORGE_ORE_COAL = create("forge", "ores/coal");

    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_RAW_TIN = create("forge", "storage_blocks/raw_tin");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_RAW_SILVER = create("forge", "storage_blocks/raw_silver");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_RAW_URANIUM = create("forge", "storage_blocks/raw_uranium");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_RAW_LEAD = create("forge", "storage_blocks/raw_lead");

    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_TIN = create("forge", "storage_blocks/tin");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_SILVER = create("forge", "storage_blocks/silver");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_URANIUM = create("forge", "storage_blocks/uranium");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_LEAD = create("forge", "storage_blocks/lead");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_STEEL = create("forge", "storage_blocks/steel");
    public static final TagKey<Item> FORGE_STORAGE_BLOCKS_BRONZE = create("forge", "storage_blocks/bronze");

    public static final TagKey<Item> FORGE_RAW_MATERIALS_TIN = create("forge", "raw_materials/tin");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_SILVER = create("forge", "raw_materials/silver");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_URANIUM = create("forge", "raw_materials/uranium");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_LEAD = create("forge", "raw_materials/lead");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_IRON = create("forge", "raw_materials/iron");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_COPPER = create("forge", "raw_materials/copper");
    public static final TagKey<Item> FORGE_RAW_MATERIALS_GOLD = create("forge", "raw_materials/gold");

    public static final TagKey<Item> FORGE_INGOTS_TIN = create("forge", "ingots/tin");
    public static final TagKey<Item> FORGE_INGOTS_BRONZE = create("forge", "ingots/bronze");
    public static final TagKey<Item> FORGE_INGOTS_STEEL = create("forge", "ingots/steel");
    public static final TagKey<Item> FORGE_INGOTS_SILVER = create("forge", "ingots/silver");
    public static final TagKey<Item> FORGE_INGOTS_LEAD = create("forge", "ingots/lead");
    public static final TagKey<Item> FORGE_INGOTS_URANIUM = create("forge", "ingots/uranium");
    public static final TagKey<Item> FORGE_INGOTS_IRON = create("forge", "ingots/iron");
    public static final TagKey<Item> FORGE_INGOTS_GOLD = create("forge", "ingots/gold");
    public static final TagKey<Item> FORGE_INGOTS_COPPER = create("forge", "ingots/copper");

    public static final TagKey<Item> FORGE_PLATES_COPPER = create("forge", "plates/copper");
    public static final TagKey<Item> FORGE_PLATES_TIN = create("forge", "plates/tin");
    public static final TagKey<Item> FORGE_PLATES_IRON = create("forge", "plates/iron");
    public static final TagKey<Item> FORGE_PLATES_LEAD = create("forge", "plates/lead");
    public static final TagKey<Item> FORGE_PLATES_GOLD = create("forge", "plates/gold");
    public static final TagKey<Item> FORGE_PLATES_BRONZE = create("forge", "plates/bronze");
    public static final TagKey<Item> FORGE_PLATES_STEEL = create("forge", "plates/steel");
    public static final TagKey<Item> FORGE_PLATES_IRIDIUM = create("forge", "plates/iridium");
    public static final TagKey<Item> FORGE_PLATES_LAPIS = create("forge", "plates/lapis");

    public static final TagKey<Item> FORGE_DUSTS_TIN = create("forge", "dusts/tin");
    public static final TagKey<Item> FORGE_DUSTS_COPPER = create("forge", "dusts/copper");
    public static final TagKey<Item> FORGE_DUSTS_GOLD = create("forge", "dusts/gold");
    public static final TagKey<Item> FORGE_DUSTS_LEAD = create("forge", "dusts/lead");
    public static final TagKey<Item> FORGE_DUSTS_COAL = create("forge", "dusts/coal");
    public static final TagKey<Item> FORGE_DUSTS_LAPIS = create("forge", "dusts/lapis");
    public static final TagKey<Item> FORGE_DUSTS_DIAMOND = create("forge", "dusts/diamond");
    public static final TagKey<Item> FORGE_DUSTS_STONE = create("forge", "dusts/stone");
    public static final TagKey<Item> FORGE_DUSTS_DEEPSLATE = create("forge", "dusts/deepslate");
    public static final TagKey<Item> FORGE_DUSTS_SULFUR = create("forge", "dusts/sulfur");
    public static final TagKey<Item> FORGE_DUSTS_URANIUM = create("forge", "dusts/uranium");
    public static final TagKey<Item> FORGE_DUSTS_SILVER = create("forge", "dusts/silver");
    public static final TagKey<Item> FORGE_DUSTS_IRON = create("forge", "dusts/iron");
    public static final TagKey<Item> FORGE_DUSTS_WOOD = create("forge", "dusts/wood");

    public static final TagKey<Item> FORGE_RODS_IRON = create("forge", "rods/iron");
    public static final TagKey<Item> FORGE_RODS_ALL_METALS = create("forge", "rods/all_metals");
    public static final TagKey<Item> FORGE_RODS_WOODEN = create("forge", "rods/wooden");

    public static final TagKey<Item> FORGE_GEMS_LAPIS = create("forge", "gems/lapis");
    public static final TagKey<Item> FORGE_GEMS_DIAMOND = create("forge", "gems/diamond");
    public static final TagKey<Item> FORGE_GEMS_EMERALD = create("forge", "gems/emerald");
    public static final TagKey<Item> FORGE_GEMS_AMETHYST = create("forge", "gems/amethyst");

    public static final TagKey<Item> FORGE_DYES_ORANGE = create("forge", "dyes/orange");
    public static final TagKey<Item> FORGE_DYES_YELLOW = create("forge", "dyes/yellow");
    public static final TagKey<Item> FORGE_DYES_BLACK = create("forge", "dyes/black");
    public static final TagKey<Item> FORGE_DYES_BLUE = create("forge", "dyes/blue");
    public static final TagKey<Item> FORGE_DYES_LIME = create("forge", "dyes/lime");

    public static final TagKey<Item> FORGE_CHESTS_WOODEN = create("forge", "chests/wooden");
    public static final TagKey<Item> FORGE_STONE = create("forge", "stone");
    public static final TagKey<Item> FORGE_COBBLESTONE = create("forge", "cobblestone");





    public static ResourceLocation rl(String path) {
        return new ResourceLocation(IndReb.MODID, path);
    }

    public static ResourceLocation rl(String namespace, String path) {
        return new ResourceLocation(namespace, path);
    }

    public static TagKey<Item> create(String path) {
        return create(MODID, path);
    }

    public static TagKey<Item> create(String namespace, String path) {
        return ItemTags.create(new ResourceLocation(namespace, path));
    }
}
