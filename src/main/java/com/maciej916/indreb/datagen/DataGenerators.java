package com.maciej916.indreb.datagen;

import com.maciej916.indreb.datagen.loottables.LootTables;
import com.maciej916.indreb.datagen.recipes.crafting.*;
import com.maciej916.indreb.datagen.recipes.machines.*;
import com.maciej916.indreb.datagen.tags.Tags;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if (event.includeServer()) {
            generator.addProvider(new Cables(generator));
            generator.addProvider(new Cutter(generator));
            generator.addProvider(new Hammer(generator));
            generator.addProvider(new Generators(generator));
            generator.addProvider(new Block(generator));
            generator.addProvider(new Blasting(generator));
            generator.addProvider(new Smelting(generator));
            generator.addProvider(new BatteryBox(generator));
            generator.addProvider(new Item(generator));
            generator.addProvider(new ItemElectric(generator));
            generator.addProvider(new ItemTool(generator));
            generator.addProvider(new Wood(generator));
            generator.addProvider(new Armour(generator));
            generator.addProvider(new Machines(generator));

            generator.addProvider(new Crushing(generator));
            generator.addProvider(new Extracting(generator));
            generator.addProvider(new Compressing(generator));
            generator.addProvider(new Sawing(generator));
            generator.addProvider(new Extruding(generator));
            generator.addProvider(new AlloySmelting(generator));

            generator.addProvider(new LootTables(generator));
            generator.addProvider(new Tags(generator, event.getExistingFileHelper()));
        }

        if (event.includeClient()) {
//            generator.addProvider(new BlockStates(generator, event.getExistingFileHelper()));
//            generator.addProvider(new Items(generator, event.getExistingFileHelper()));
        }
    }

}
