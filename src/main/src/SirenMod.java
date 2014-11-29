package sirenmod;

import sirenmod.blocks.Blocks;
import sirenmod.lib.ModInfo;
import sirenmod.proxies.Proxies;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true,
		serverSideRequired = false)
public class SirenMod {
	
	@Instance(ModInfo.ID)
	public static SirenMod INSTANCE;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		Proxies.init();
		Blocks.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
}