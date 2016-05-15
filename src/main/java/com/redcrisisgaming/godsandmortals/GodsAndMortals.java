package com.redcrisisgaming.godsandmortals;

import com.redcrisisgaming.godsandmortals.lib.Reference;
import com.redcrisisgaming.godsandmortals.proxy.CommonProxy;
import com.redcrisisgaming.godsandmortals.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by daddy on 5/13/2016.
 */

@Mod(modid = Reference.MOD_ID,
     name = Reference.MOD_NAME,
     version = Reference.VERSION)
public class GodsAndMortals {

    @Mod.Instance(Reference.MOD_ID)
    public static GodsAndMortals instance;

    private LogHelper meLog = new LogHelper();

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        meLog.info("In Pre-Init");
        this.proxy.preInit(e);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        meLog.info("In Init");
        this.proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        meLog.info("In Post-Init");
        this.proxy.postInit(e);
    }

}
