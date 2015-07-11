package org.priceykins.forge.mod.satcraft.world.gen;

import java.util.Random;

import org.priceykins.forge.mod.satcraft.blocks.SatCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OverworldGenerator implements IWorldGenerator {

	public OverworldGenerator(){

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {

		switch(world.provider.getDimensionId()){
		case -1:
			//Do nothing, no nether ores to add
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			//Do nothing, no end ores to add
			break;
		}


	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ){

		addOreSpawn(SatCraftBlocks.titaniumOre, world, random, chunkX, chunkZ, 16, 16, 4 + random.nextInt(3), 3, 10, 45);
		addOreSpawn(SatCraftBlocks.aluminiumOre, world, random, chunkX, chunkZ, 16, 16, 7 + random.nextInt(7), 6, 25, 175);
		addOreSpawn(SatCraftBlocks.silicaOre, world, random, chunkX, chunkZ, 16, 16, 7 + random.nextInt(10), 4, 45, 175);

	}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY){
        
        assert maxY > minY;
        assert maxX > 0 && maxX <= 16;
        assert minY > 0;
        assert maxY < 256 && maxY > 0;
        assert maxZ > 0 && maxZ <= 16;

        
		int diffBtwnMinMaxY = maxY - minY;
		for(int i = 0; i < chancesToSpawn; i++){
			int firstBlockXCoord = blockXPos + random.nextInt(maxX);
			int firstBlockYCoord = minY + random.nextInt(diffBtwnMinMaxY);
			int firstBlockZCoord = blockZPos + random.nextInt(maxZ);
			BlockPos position = new BlockPos(firstBlockXCoord, firstBlockYCoord, firstBlockZCoord);
			(new WorldGenMinable(block.getDefaultState(), 13)).generate(world, random, position);
		}
	}

}
