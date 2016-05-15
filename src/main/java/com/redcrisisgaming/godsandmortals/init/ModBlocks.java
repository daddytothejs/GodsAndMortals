package com.redcrisisgaming.godsandmortals.init;

import com.redcrisisgaming.godsandmortals.blocks.BlockFireOre;
import com.redcrisisgaming.godsandmortals.blocks.BlockGAM;
import com.redcrisisgaming.godsandmortals.blocks.BlockThunderOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by daddy on 5/13/2016.
 */
public class ModBlocks {

    public static final BlockGAM oreThunder = new BlockThunderOre();
    public static final BlockGAM oreFire = new BlockFireOre();

    public static void register() {
        GameRegistry.register(oreThunder);
        GameRegistry.register(oreFire);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        oreThunder.initModels();
        oreFire.initModels();
    }
}
