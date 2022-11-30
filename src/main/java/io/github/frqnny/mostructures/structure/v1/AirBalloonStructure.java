package io.github.frqnny.mostructures.structure.v1;

import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.random.AtomicSimpleRandom;
import net.minecraft.world.gen.random.ChunkRandom;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;

import java.util.Optional;

public class AirBalloonStructure extends Structure {
    public AirBalloonStructure() {
        super(ConfigMS.CODEC, context -> {
            if (!ModStructure.canGenerate(context)) {
                return Optional.empty();
            }

            ChunkRandom chunkRandom = new ChunkRandom(new AtomicSimpleRandom(0L));
            chunkRandom.setCarverSeed(context.seed(), context.chunkPos().x, context.chunkPos().z);

            BlockPos blockPos = new BlockPos(context.chunkPos().getStartX(), Math.max(chunkRandom.nextInt(100), 45), context.chunkPos().getStartZ());
            return StructurePoolBasedGenerator.generate(context, PoolStructurePiece::new, blockPos, true, true);
        });
    }

    @Override
    protected Optional<StructurePosition> getStructurePosition(Context context) {
        return Optional.empty();
    }

    @Override
    public StructureType<?> getType() {
        return null;
    }
}