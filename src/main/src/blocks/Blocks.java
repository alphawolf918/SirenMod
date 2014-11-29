package sirenmod.blocks;

import net.minecraft.block.Block;
import sirenmod.blocks.sirens.DiamondSiren;
import sirenmod.blocks.sirens.EmeraldSiren;
import sirenmod.blocks.sirens.GoldSiren;
import sirenmod.blocks.sirens.IronSiren;
import sirenmod.lib.Ids;
import sirenmod.lib.enums.State;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static final Block ironSiren = new IronSiren(Ids.ironSirenID,
			State.OFF);
	public static final Block ironSirenON = new IronSiren(
			Ids.ironSirenOnID,
			State.ON);
	public static final Block goldSiren = new GoldSiren(Ids.goldSirenID,
			State.OFF);
	public static final Block goldSirenON = new GoldSiren(
			Ids.goldSirenOnID,
			State.ON);
	public static final Block diamondSiren = new DiamondSiren(
			Ids.diamondSirenID, State.OFF);
	public static final Block diamondSirenON = new DiamondSiren(
			Ids.diamondSirenOnID, State.ON);
	public static final Block emeraldSiren = new EmeraldSiren(
			Ids.emeraldSirenID, State.OFF);
	public static final Block emeraldSirenON = new EmeraldSiren(
			Ids.emeraldSirenOnID, State.ON);

	public static void init() {
		addBlock(ironSiren, "Iron Siren");
		addBlock(goldSiren, "Gold Siren");
		addBlock(diamondSiren, "Diamond Siren");
		addBlock(emeraldSiren, "Emerald Siren");
	}
	
	public static void addBlock(Block par1Block, String par2Name) {
		GameRegistry.registerBlock(par1Block, par2Name);
		LanguageRegistry.addName(par1Block, par2Name);
	}
}