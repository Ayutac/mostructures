package io.github.frqnny.mostructures.datagen

import io.github.frqnny.mostructures.MoStructures
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.registry.RegistryBuilder
import net.minecraft.registry.RegistryKeys

class MoStructuresDataGeneratorEntry implements DataGeneratorEntrypoint {

    @Override
    void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        def pack = fabricDataGenerator.createPack()
        def add = {FabricDataGenerator.Pack.RegistryDependentFactory factory ->
            pack.addProvider factory
        }

        add MoStructuresWorldGenProvider::new
    }

    @Override
    void buildRegistry(RegistryBuilder registryBuilder) {
//        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, MoStructuresWorldGenBootstrap::configuredFeatures)
//        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, MoStructuresWorldGenBootstrap::placedFeatures)
        registryBuilder.addRegistry(RegistryKeys.STRUCTURE, MoStructuresWorldGenBootstrap::structures)
        registryBuilder.addRegistry(RegistryKeys.STRUCTURE_SET, MoStructuresWorldGenBootstrap::structureSets)
        registryBuilder.addRegistry(RegistryKeys.TEMPLATE_POOL, MoStructuresWorldGenBootstrap::templatePools)
    }

    @Override
    String getEffectiveModId() {
        return MoStructures.MODID
    }

}
