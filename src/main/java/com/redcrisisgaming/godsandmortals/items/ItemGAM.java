package com.redcrisisgaming.godsandmortals.items;

import com.redcrisisgaming.godsandmortals.creativetab.CreativeTab;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by daddy on 5/13/2016.
 */
public class ItemGAM extends Item {

    public ItemGAM(String name){
        super();
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTab.GAM_TAB);
        setMaxStackSize(1);
        setNoRepair();

    }

    @SideOnly(Side.CLIENT)
    public void initModels(){
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
    }
}
