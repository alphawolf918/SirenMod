package sirenmod.blocks.sirens;

import java.util.Random;

import net.minecraft.world.World;
import sirenmod.blocks.Blocks;
import sirenmod.lib.enums.State;

public class GoldSiren extends SirenBase {

	public static final String sirenInfo = "goldsiren";
	public static State state = State.OFF;
	
	public GoldSiren(int par1, State state) {
		super(par1, state);
		this.state = state;
		this.setUnlocalizedName(sirenInfo);
		this.setSirenBlockSound(sirenInfo);
		this.setTextureName("sirenmod:" + sirenInfo);
		this.setTickRandomly(true);
	}

	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		this.stateCheck(par1World, par2, par3, par4);
	}
	
	public void stateCheck(World par1World, int par2, int par3, int par4) {
		if (!par1World.isRemote) {
			if (state == State.ON
					&& !par1World.isBlockIndirectlyGettingPowered(par2,
							par3, par4)) {
				par1World.scheduleBlockUpdate(par2, par3, par4,
						this.blockID,
						0);
				par1World
				.setBlock(par2, par3, par4,
						Blocks.goldSiren.blockID);
			}
		} else if (this.state == State.OFF
				&& par1World.isBlockIndirectlyGettingPowered(par2,
						par3, par4)) {
			par1World
			.setBlock(par2, par3, par4,
					Blocks.goldSirenON.blockID);
		}
		if (this.state == State.OFF
				&& !par1World.isBlockIndirectlyGettingPowered(
						par2,
						par3, par4)) {
			par1World
			.setBlock(par2, par3, par4,
					Blocks.goldSiren.blockID);
		}
	}

	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3,
			int par4, int par5) {
		this.stateCheck(par1World, par2, par3, par4);
	}
	
	@Override
	public void updateTick(World par1World, int par2, int par3, int par4,
			Random par5Random) {
		this.playAlarm(par1World, par2, par3, par4);
		this.stateCheck(par1World, par2, par3, par4);
	}

	public void playAlarm(World par1World, int par2, int par3, int par4) {
		if (state == State.ON
				&& par1World.isBlockIndirectlyGettingPowered(par2,
						par3, par4)) {
			par1World.playSoundEffect(par2 + 1.5D, par3 + 1.5D,
					par4 + 1.5D,
					"sirenmod:alarms.goldsiren",
					2.5F,
					par1World.rand.nextFloat() * 0.1F + 0.9F);
		}
	}
}
