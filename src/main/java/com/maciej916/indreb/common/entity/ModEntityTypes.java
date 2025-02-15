package com.maciej916.indreb.common.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.maciej916.indreb.IndReb.MODID;


public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MODID);

    public static final RegistryObject<EntityType<PrimedITnt>> PRIMED_ITNT =
            ENTITY_TYPES.register("primed_itnt",
                    () -> EntityType.Builder.<PrimedITnt>of(PrimedITnt::new, MobCategory.MISC)
                            .sized(0.98F, 0.98F)
                            .clientTrackingRange(10)
                            .updateInterval(10)
                            .build(new ResourceLocation(MODID, "primed_itnt").toString()));

    public static final RegistryObject<EntityType<PrimedNuke>> NUKE =
            ENTITY_TYPES.register("nuke",
                    () -> EntityType.Builder.<PrimedNuke>of(PrimedNuke::new, MobCategory.MISC)
                            .sized(0.98F, 0.98F)
                            .clientTrackingRange(10)
                            .updateInterval(10)
                            .build(new ResourceLocation(MODID, "nuke").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
