
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.northsessentials.init;

import net.nwtg.northsessentials.block.RedstoneNodeBlock;
import net.nwtg.northsessentials.block.RedstoneDeepslateNodeBlock;
import net.nwtg.northsessentials.block.QuartzNodeBlock;
import net.nwtg.northsessentials.block.QuartzDeepslateNodeBlock;
import net.nwtg.northsessentials.block.NetherRedstoneNodeBlock;
import net.nwtg.northsessentials.block.NetherQuartzNodeBlock;
import net.nwtg.northsessentials.block.NetherLapisNodeBlock;
import net.nwtg.northsessentials.block.NetherIronNodeBlock;
import net.nwtg.northsessentials.block.NetherGoldNodeBlock;
import net.nwtg.northsessentials.block.NetherEmeraldNodeBlock;
import net.nwtg.northsessentials.block.NetherDiamondNodeBlock;
import net.nwtg.northsessentials.block.NetherCopperNodeBlock;
import net.nwtg.northsessentials.block.NetherCoalNodeBlock;
import net.nwtg.northsessentials.block.NetherAncientDebrisNodeBlock;
import net.nwtg.northsessentials.block.NetherAmethystNodeBlock;
import net.nwtg.northsessentials.block.LapisNodeBlock;
import net.nwtg.northsessentials.block.LapisDeepslateNodeBlock;
import net.nwtg.northsessentials.block.IronNodeBlock;
import net.nwtg.northsessentials.block.IronDeepslateNodeBlock;
import net.nwtg.northsessentials.block.GoldNodeBlock;
import net.nwtg.northsessentials.block.GoldDeepslateNodeBlock;
import net.nwtg.northsessentials.block.EmptyNodeBlock;
import net.nwtg.northsessentials.block.EmptyNetherNodeBlock;
import net.nwtg.northsessentials.block.EmptyDeepslateNodeBlock;
import net.nwtg.northsessentials.block.EmeraldNodeBlock;
import net.nwtg.northsessentials.block.EmeraldDeepslateNodeBlock;
import net.nwtg.northsessentials.block.ElevatorBlockBlock;
import net.nwtg.northsessentials.block.DiamondNodeBlock;
import net.nwtg.northsessentials.block.DiamondDeepslateNodeBlock;
import net.nwtg.northsessentials.block.CopperNodeBlock;
import net.nwtg.northsessentials.block.CopperDeepslateNodeBlock;
import net.nwtg.northsessentials.block.CoalNodeBlock;
import net.nwtg.northsessentials.block.CoalDeepslateNodeBlock;
import net.nwtg.northsessentials.block.AncientDebrisNodeBlock;
import net.nwtg.northsessentials.block.AncientDebrisDeepslateNodeBlock;
import net.nwtg.northsessentials.block.AmethystNodeBlock;
import net.nwtg.northsessentials.block.AmethystDeepslateNodeBlock;
import net.nwtg.northsessentials.NorthsessentialsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class NorthsessentialsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NorthsessentialsMod.MODID);
	public static final RegistryObject<Block> COAL_NODE = REGISTRY.register("coal_node", () -> new CoalNodeBlock());
	public static final RegistryObject<Block> COPPER_NODE = REGISTRY.register("copper_node", () -> new CopperNodeBlock());
	public static final RegistryObject<Block> IRON_NODE = REGISTRY.register("iron_node", () -> new IronNodeBlock());
	public static final RegistryObject<Block> QUARTZ_NODE = REGISTRY.register("quartz_node", () -> new QuartzNodeBlock());
	public static final RegistryObject<Block> AMETHYST_NODE = REGISTRY.register("amethyst_node", () -> new AmethystNodeBlock());
	public static final RegistryObject<Block> EMERALD_NODE = REGISTRY.register("emerald_node", () -> new EmeraldNodeBlock());
	public static final RegistryObject<Block> GOLD_NODE = REGISTRY.register("gold_node", () -> new GoldNodeBlock());
	public static final RegistryObject<Block> LAPIS_NODE = REGISTRY.register("lapis_node", () -> new LapisNodeBlock());
	public static final RegistryObject<Block> REDSTONE_NODE = REGISTRY.register("redstone_node", () -> new RedstoneNodeBlock());
	public static final RegistryObject<Block> DIAMOND_NODE = REGISTRY.register("diamond_node", () -> new DiamondNodeBlock());
	public static final RegistryObject<Block> ANCIENT_DEBRIS_NODE = REGISTRY.register("ancient_debris_node", () -> new AncientDebrisNodeBlock());
	public static final RegistryObject<Block> COAL_DEEPSLATE_NODE = REGISTRY.register("coal_deepslate_node", () -> new CoalDeepslateNodeBlock());
	public static final RegistryObject<Block> COPPER_DEEPSLATE_NODE = REGISTRY.register("copper_deepslate_node", () -> new CopperDeepslateNodeBlock());
	public static final RegistryObject<Block> IRON_DEEPSLATE_NODE = REGISTRY.register("iron_deepslate_node", () -> new IronDeepslateNodeBlock());
	public static final RegistryObject<Block> QUARTZ_DEEPSLATE_NODE = REGISTRY.register("quartz_deepslate_node", () -> new QuartzDeepslateNodeBlock());
	public static final RegistryObject<Block> AMETHYST_DEEPSLATE_NODE = REGISTRY.register("amethyst_deepslate_node", () -> new AmethystDeepslateNodeBlock());
	public static final RegistryObject<Block> EMERALD_DEEPSLATE_NODE = REGISTRY.register("emerald_deepslate_node", () -> new EmeraldDeepslateNodeBlock());
	public static final RegistryObject<Block> GOLD_DEEPSLATE_NODE = REGISTRY.register("gold_deepslate_node", () -> new GoldDeepslateNodeBlock());
	public static final RegistryObject<Block> LAPIS_DEEPSLATE_NODE = REGISTRY.register("lapis_deepslate_node", () -> new LapisDeepslateNodeBlock());
	public static final RegistryObject<Block> REDSTONE_DEEPSLATE_NODE = REGISTRY.register("redstone_deepslate_node", () -> new RedstoneDeepslateNodeBlock());
	public static final RegistryObject<Block> DIAMOND_DEEPSLATE_NODE = REGISTRY.register("diamond_deepslate_node", () -> new DiamondDeepslateNodeBlock());
	public static final RegistryObject<Block> ANCIENT_DEBRIS_DEEPSLATE_NODE = REGISTRY.register("ancient_debris_deepslate_node", () -> new AncientDebrisDeepslateNodeBlock());
	public static final RegistryObject<Block> NETHER_COAL_NODE = REGISTRY.register("nether_coal_node", () -> new NetherCoalNodeBlock());
	public static final RegistryObject<Block> NETHER_COPPER_NODE = REGISTRY.register("nether_copper_node", () -> new NetherCopperNodeBlock());
	public static final RegistryObject<Block> NETHER_IRON_NODE = REGISTRY.register("nether_iron_node", () -> new NetherIronNodeBlock());
	public static final RegistryObject<Block> NETHER_QUARTZ_NODE = REGISTRY.register("nether_quartz_node", () -> new NetherQuartzNodeBlock());
	public static final RegistryObject<Block> NETHER_AMETHYST_NODE = REGISTRY.register("nether_amethyst_node", () -> new NetherAmethystNodeBlock());
	public static final RegistryObject<Block> NETHER_EMERALD_NODE = REGISTRY.register("nether_emerald_node", () -> new NetherEmeraldNodeBlock());
	public static final RegistryObject<Block> NETHER_GOLD_NODE = REGISTRY.register("nether_gold_node", () -> new NetherGoldNodeBlock());
	public static final RegistryObject<Block> NETHER_LAPIS_NODE = REGISTRY.register("nether_lapis_node", () -> new NetherLapisNodeBlock());
	public static final RegistryObject<Block> NETHER_REDSTONE_NODE = REGISTRY.register("nether_redstone_node", () -> new NetherRedstoneNodeBlock());
	public static final RegistryObject<Block> NETHER_DIAMOND_NODE = REGISTRY.register("nether_diamond_node", () -> new NetherDiamondNodeBlock());
	public static final RegistryObject<Block> NETHER_ANCIENT_DEBRIS_NODE = REGISTRY.register("nether_ancient_debris_node", () -> new NetherAncientDebrisNodeBlock());
	public static final RegistryObject<Block> EMPTY_NODE = REGISTRY.register("empty_node", () -> new EmptyNodeBlock());
	public static final RegistryObject<Block> EMPTY_DEEPSLATE_NODE = REGISTRY.register("empty_deepslate_node", () -> new EmptyDeepslateNodeBlock());
	public static final RegistryObject<Block> EMPTY_NETHER_NODE = REGISTRY.register("empty_nether_node", () -> new EmptyNetherNodeBlock());
	public static final RegistryObject<Block> ELEVATOR_BLOCK = REGISTRY.register("elevator_block", () -> new ElevatorBlockBlock());
}
