package com.redcrisisgaming.godsandmortals.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static net.minecraft.item.Item.getItemFromBlock;

/**
 * Created by daddy on 5/14/2016.
 */
public class BlockThunderOre extends BlockGAM {

    private static final String NAME = "oreThunder";

    public BlockThunderOre() {
        super(NAME);
        setHarvestLevel("pickaxe", 3);
        setHardness(20.0F);
        setResistance(100.0F);
        setStepSound(SoundType.STONE);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune){
        return getItemFromBlock(this);
    }

}
