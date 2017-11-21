package com.Karkic.RuneCraft;

import com.Karkic.RuneCraft.proxy.IProxy;
import com.Karkic.RuneCraft.reference.Messages;
import com.Karkic.RuneCraft.reference.Reference;
import com.Karkic.RuneCraft.util.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RuneCraft.Mod_ID,
        certificateFingerprint = Reference.FINGERPRINT,
        name = Reference.MOD_NAME,
        version ="1.12.2-1.0")
public class RuneCraft {
        public static final String Mod_ID = "RuneCraft";
        static final String FINGERPRINT = "@FINGERPRINT@";


        @Mod.Instance("RuneCraft")
        public static RuneCraft instance;

        @SidedProxy(clientSide = "com.Karkic.RuneCraft.proxy.ClientProxy", serverSide = "com.Karkic.RuneCraft.proxy.ServerProxy")
        public static IProxy proxy;

        @Mod.EventHandler
        public void invalidFingerprint(FMLFingerprintViolationEvent event){

                if (FINGERPRINT.equals("@FINGERPRINT@"))
                {
                        LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
                }
                 else
                {
                        LogHelper.info(Messages.INVALID_FINGERPRINT_MESSAGE);
                }
        }

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {

        }
        @Mod.EventHandler
        public void init(FMLInitializationEvent event)
        {

        }
        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event)
        {

        }
}
