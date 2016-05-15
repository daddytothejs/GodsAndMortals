package com.redcrisisgaming.godsandmortals.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by daddy on 5/13/2016.
 */
public interface IProxy {

    public abstract void preInit(FMLPreInitializationEvent e);

    public abstract void init(FMLInitializationEvent e);

    public abstract void postInit(FMLPostInitializationEvent e);

    public abstract ClientProxy getClientProxy();

    public abstract void initTextures();

    public abstract void registerEventHandlers();

    public abstract void registerKeybindings();

    public abstract void playSound(String soundName, float xCoord, float yCoord, float zCoord, float volume, float pitch);

    public abstract void spawnParticle(String particleName, double xCoord, double yCoord, double zCoord, double xVelocity, double yVelocity, double zVelocity);

}
