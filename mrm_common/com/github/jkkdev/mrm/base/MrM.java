package com.github.jkkdev.mrm.base;

import java.util.logging.Logger;

import com.github.jkkdev.mrm.handler.PacketHandler;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid=DefaultProperties.MOD_ID, name=DefaultProperties.MOD_NAME, version=DefaultProperties.MOD_VERSION, modLanguage=DefaultProperties.MOD_LANGUAGE)

@NetworkMod(channels = {DefaultProperties.MOD_CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)

public class MrM {
    
    @Instance(DefaultProperties.MOD_ID)
    public MrM instance;
    
    @SidedProxy(modId=DefaultProperties.MOD_ID, clientSide=DefaultProperties.CLIENT_PROXY, serverSide=DefaultProperties.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static final Logger mrmLog = Logger.getLogger("MrM");
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent e){
        mrmLog.setParent(FMLLog.getLogger());
        mrmLog.info("hisdfg");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent e){
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent e){
        
    }

}
