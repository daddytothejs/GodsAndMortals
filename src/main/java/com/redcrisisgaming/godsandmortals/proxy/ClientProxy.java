package com.redcrisisgaming.godsandmortals.proxy;

import com.redcrisisgaming.godsandmortals.init.ModBlocks;
import com.redcrisisgaming.godsandmortals.init.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by daddy on 5/13/2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e){
        super.preInit(e);
        ModItems.initModels();
        ModBlocks.initModels();
    }

    @Override
    public ClientProxy getClientProxy() {
        return this;
    }

    @Override
    public void initTextures() {

    }

    @Override
    public void registerEventHandlers() {

    }

    @Override
    public void registerKeybindings() {

    }

    @Override
    public void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch) {

    }

    @Override
    public void spawnParticle(String particleName, double xCoord, double yCoord, double zCoord, double xVelocity, double yVelocity, double zVelocity) {

    }
}
