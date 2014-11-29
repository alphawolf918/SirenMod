package sirenmod.blocks.sirens;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import sirenmod.lib.enums.State;

public abstract class SirenBase extends BlockContainer {

	public static State state = State.OFF;
	public String texture = "";
	public String sound = "";
	
	public SirenBase(int par1, State state) {
		super(par1, Material.iron);
		this.state = State.OFF;
		if (this.state == State.ON) {
			this.setLightValue(1.0F);
		} else {
			this.setLightValue(0.0F);
		}
		this.setCreativeTab(CreativeTabs.tabRedstone);
		this.setHardness(2F);
		this.setResistance(10);
		this.setStepSound(Block.soundMetalFootstep);
		this.setTickRandomly(true);
	}

	public void setSirenBlockSound(String par1) {
		this.sound = par1;
	}

	public String getSirenBlockSound() {
		return this.sound;
	}
}