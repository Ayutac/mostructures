package io.github.frqnny.mostructures.datagen.worldgen

import net.minecraft.registry.Registerable
import net.minecraft.registry.RegistryKeys
import net.minecraft.structure.StructureSet
import net.minecraft.structure.pool.StructurePool
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.structure.Structure

class MoStructuresWorldGenBootstrap {

    private MoStructuresWorldGenBootstrap() {
        /* No instantiation */
    }

    static void structures(Registerable<Structure> registry) {
        def biomeLookup = registry.getRegistryLookup(RegistryKeys.BIOME)
        def templatePoolLookup = registry.getRegistryLookup(RegistryKeys.TEMPLATE_POOL)
//        registry.register(ExampleMod.MY_HOUSE_STRUCTURE, createMyHouseStructure(biomeLookup, templatePoolLookup))
    }

    static void structureSets(Registerable<StructureSet> registry) {
        def structureLookup = registry.getRegistryLookup(RegistryKeys.STRUCTURE)
//        registry.register(ExampleMod.MY_HOUSE_STRUCTURE_SET, createMyHouseStructureSet(structureLookup))
    }

    static void templatePools(Registerable<StructurePool> registry) {
        def templatePoolLookup = registry.getRegistryLookup(RegistryKeys.TEMPLATE_POOL)
//        registry.register(ExampleMod.MY_HOUSE_TEMPLATE_POOL, createMyHouseStructurePool(templatePoolLookup))
    }

}
