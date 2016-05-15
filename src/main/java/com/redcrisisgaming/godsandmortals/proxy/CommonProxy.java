package com.redcrisisgaming.godsandmortals.proxy;

import com.redcrisisgaming.godsandmortals.init.ModBlocks;
import com.redcrisisgaming.godsandmortals.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by daddy on 5/13/2016.
 */
public abstract class CommonProxy implements IProxy {

    public void preInit(FMLPreInitializationEvent e){
        ModItems.register();
        ModBlocks.register();
    }

    public void init(FMLInitializationEvent e){

    }

    public void postInit(FMLPostInitializationEvent e){

    }

}
