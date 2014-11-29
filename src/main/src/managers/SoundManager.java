package sirenmod.managers;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundManager {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		this.addSound(event, "ironsiren");
		this.addSound(event, "goldsiren");
		this.addSound(event, "diamondsiren");
		this.addSound(event, "emeraldsiren");
	}
	
	public void addSound(SoundLoadEvent event, String sound) {
		sound = "sirenmod:alarms/" + sound + ".ogg";
		event.manager.addSound(sound);
	}
}