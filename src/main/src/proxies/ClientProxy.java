package sirenmod.proxies;

import net.minecraftforge.common.MinecraftForge;
import sirenmod.managers.SoundManager;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initSounds() {
		MinecraftForge.EVENT_BUS.register(new SoundManager());
	}
}