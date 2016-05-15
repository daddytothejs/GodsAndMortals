package com.redcrisisgaming.godsandmortals.creativetab;

import com.redcrisisgaming.godsandmortals.init.ModItems;
import com.redcrisisgaming.godsandmortals.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by daddy on 5/14/2016.
 */
public class CreativeTab {

    public static final CreativeTabs GAM_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem(){
            return ModItems.katana;
        }
    };
}
