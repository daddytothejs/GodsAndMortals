package com.redcrisisgaming.godsandmortals.blocks;

import com.redcrisisgaming.godsandmortals.creativetab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by daddy on 5/14/2016.
 */
public class BlockGAM extends Block {

    public BlockGAM(String name) {
        this(name, Material.rock);
    }

    public BlockGAM(String name, Material material){
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.GAM_TAB);
    }

    @SideOnly(Side.CLIENT)
    public void initModels() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName().toString()));
    }

}
