package com.redcrisisgaming.godsandmortals.init;

import com.redcrisisgaming.godsandmortals.items.ItemGAM;
import com.redcrisisgaming.godsandmortals.items.ItemKatana;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by daddy on 5/13/2016.
 */
public class ModItems {

    public static final ItemGAM katana = new ItemKatana("katana");
    public static final ItemBlock itemOreThunder = new ItemBlock(ModBlocks.oreThunder);


    public static void register() {
        GameRegistry.register(katana);


        itemOreThunder.setRegistryName(ModBlocks.oreThunder.getRegistryName().toString());
        GameRegistry.register(itemOreThunder);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        katana.initModels();
    }
}
