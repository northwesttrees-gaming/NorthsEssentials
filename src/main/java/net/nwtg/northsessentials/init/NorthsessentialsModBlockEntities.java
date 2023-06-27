
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.northsessentials.init;

import net.nwtg.northsessentials.block.entity.WarpedElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.SpruceElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.RedstoneNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.RedstoneDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.QuartzNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.QuartzDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.OakElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherRedstoneNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherQuartzNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherLapisNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherIronNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherGoldNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherEmeraldNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherDiamondNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherCopperNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherCoalNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherAncientDebrisNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.NetherAmethystNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.MangroveElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.LapisNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.LapisDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.JungleElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.IronNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.IronDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.GoldNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.GoldDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.EmptyNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.EmptyNetherNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.EmptyDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.EmeraldNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.EmeraldDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.DiamondNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.DiamondDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.DarkOakElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.CrimsonElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.CopperNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.CopperDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.CoalNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.CoalDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.BirchElevatorBlockBlockEntity;
import net.nwtg.northsessentials.block.entity.AncientDebrisNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.AncientDebrisDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.AmethystNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.AmethystDeepslateNodeBlockEntity;
import net.nwtg.northsessentials.block.entity.AcaciaElevatorBlockBlockEntity;
import net.nwtg.northsessentials.NorthsessentialsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class NorthsessentialsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NorthsessentialsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COAL_NODE = register("coal_node", NorthsessentialsModBlocks.COAL_NODE, CoalNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COPPER_NODE = register("copper_node", NorthsessentialsModBlocks.COPPER_NODE, CopperNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_NODE = register("iron_node", NorthsessentialsModBlocks.IRON_NODE, IronNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARTZ_NODE = register("quartz_node", NorthsessentialsModBlocks.QUARTZ_NODE, QuartzNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AMETHYST_NODE = register("amethyst_node", NorthsessentialsModBlocks.AMETHYST_NODE, AmethystNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMERALD_NODE = register("emerald_node", NorthsessentialsModBlocks.EMERALD_NODE, EmeraldNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_NODE = register("gold_node", NorthsessentialsModBlocks.GOLD_NODE, GoldNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAPIS_NODE = register("lapis_node", NorthsessentialsModBlocks.LAPIS_NODE, LapisNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_NODE = register("redstone_node", NorthsessentialsModBlocks.REDSTONE_NODE, RedstoneNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIAMOND_NODE = register("diamond_node", NorthsessentialsModBlocks.DIAMOND_NODE, DiamondNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_DEBRIS_NODE = register("ancient_debris_node", NorthsessentialsModBlocks.ANCIENT_DEBRIS_NODE, AncientDebrisNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COAL_DEEPSLATE_NODE = register("coal_deepslate_node", NorthsessentialsModBlocks.COAL_DEEPSLATE_NODE, CoalDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COPPER_DEEPSLATE_NODE = register("copper_deepslate_node", NorthsessentialsModBlocks.COPPER_DEEPSLATE_NODE, CopperDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> IRON_DEEPSLATE_NODE = register("iron_deepslate_node", NorthsessentialsModBlocks.IRON_DEEPSLATE_NODE, IronDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> QUARTZ_DEEPSLATE_NODE = register("quartz_deepslate_node", NorthsessentialsModBlocks.QUARTZ_DEEPSLATE_NODE, QuartzDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AMETHYST_DEEPSLATE_NODE = register("amethyst_deepslate_node", NorthsessentialsModBlocks.AMETHYST_DEEPSLATE_NODE, AmethystDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMERALD_DEEPSLATE_NODE = register("emerald_deepslate_node", NorthsessentialsModBlocks.EMERALD_DEEPSLATE_NODE, EmeraldDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GOLD_DEEPSLATE_NODE = register("gold_deepslate_node", NorthsessentialsModBlocks.GOLD_DEEPSLATE_NODE, GoldDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LAPIS_DEEPSLATE_NODE = register("lapis_deepslate_node", NorthsessentialsModBlocks.LAPIS_DEEPSLATE_NODE, LapisDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REDSTONE_DEEPSLATE_NODE = register("redstone_deepslate_node", NorthsessentialsModBlocks.REDSTONE_DEEPSLATE_NODE, RedstoneDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DIAMOND_DEEPSLATE_NODE = register("diamond_deepslate_node", NorthsessentialsModBlocks.DIAMOND_DEEPSLATE_NODE, DiamondDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_DEBRIS_DEEPSLATE_NODE = register("ancient_debris_deepslate_node", NorthsessentialsModBlocks.ANCIENT_DEBRIS_DEEPSLATE_NODE, AncientDebrisDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_COAL_NODE = register("nether_coal_node", NorthsessentialsModBlocks.NETHER_COAL_NODE, NetherCoalNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_COPPER_NODE = register("nether_copper_node", NorthsessentialsModBlocks.NETHER_COPPER_NODE, NetherCopperNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_IRON_NODE = register("nether_iron_node", NorthsessentialsModBlocks.NETHER_IRON_NODE, NetherIronNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_QUARTZ_NODE = register("nether_quartz_node", NorthsessentialsModBlocks.NETHER_QUARTZ_NODE, NetherQuartzNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_AMETHYST_NODE = register("nether_amethyst_node", NorthsessentialsModBlocks.NETHER_AMETHYST_NODE, NetherAmethystNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_EMERALD_NODE = register("nether_emerald_node", NorthsessentialsModBlocks.NETHER_EMERALD_NODE, NetherEmeraldNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_GOLD_NODE = register("nether_gold_node", NorthsessentialsModBlocks.NETHER_GOLD_NODE, NetherGoldNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_LAPIS_NODE = register("nether_lapis_node", NorthsessentialsModBlocks.NETHER_LAPIS_NODE, NetherLapisNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_REDSTONE_NODE = register("nether_redstone_node", NorthsessentialsModBlocks.NETHER_REDSTONE_NODE, NetherRedstoneNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_DIAMOND_NODE = register("nether_diamond_node", NorthsessentialsModBlocks.NETHER_DIAMOND_NODE, NetherDiamondNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NETHER_ANCIENT_DEBRIS_NODE = register("nether_ancient_debris_node", NorthsessentialsModBlocks.NETHER_ANCIENT_DEBRIS_NODE, NetherAncientDebrisNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMPTY_NODE = register("empty_node", NorthsessentialsModBlocks.EMPTY_NODE, EmptyNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMPTY_DEEPSLATE_NODE = register("empty_deepslate_node", NorthsessentialsModBlocks.EMPTY_DEEPSLATE_NODE, EmptyDeepslateNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EMPTY_NETHER_NODE = register("empty_nether_node", NorthsessentialsModBlocks.EMPTY_NETHER_NODE, EmptyNetherNodeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OAK_ELEVATOR_BLOCK = register("oak_elevator_block", NorthsessentialsModBlocks.OAK_ELEVATOR_BLOCK, OakElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPRUCE_ELEVATOR_BLOCK = register("spruce_elevator_block", NorthsessentialsModBlocks.SPRUCE_ELEVATOR_BLOCK, SpruceElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIRCH_ELEVATOR_BLOCK = register("birch_elevator_block", NorthsessentialsModBlocks.BIRCH_ELEVATOR_BLOCK, BirchElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLE_ELEVATOR_BLOCK = register("jungle_elevator_block", NorthsessentialsModBlocks.JUNGLE_ELEVATOR_BLOCK, JungleElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ACACIA_ELEVATOR_BLOCK = register("acacia_elevator_block", NorthsessentialsModBlocks.ACACIA_ELEVATOR_BLOCK, AcaciaElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_OAK_ELEVATOR_BLOCK = register("dark_oak_elevator_block", NorthsessentialsModBlocks.DARK_OAK_ELEVATOR_BLOCK, DarkOakElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRIMSON_ELEVATOR_BLOCK = register("crimson_elevator_block", NorthsessentialsModBlocks.CRIMSON_ELEVATOR_BLOCK, CrimsonElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WARPED_ELEVATOR_BLOCK = register("warped_elevator_block", NorthsessentialsModBlocks.WARPED_ELEVATOR_BLOCK, WarpedElevatorBlockBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> MANGROVE_ELEVATOR_BLOCK = register("mangrove_elevator_block", NorthsessentialsModBlocks.MANGROVE_ELEVATOR_BLOCK, MangroveElevatorBlockBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
