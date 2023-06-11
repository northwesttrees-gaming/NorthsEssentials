package net.nwtg.northsessentials.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class OreNodeOnBlockRightClickedProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getLevel().getBlockState(event.getPos()), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		execute(null, world, x, y, z, blockstate, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (blockstate.is(BlockTags.create(new ResourceLocation("northsessentials:nodes/ore")))) {
			if (entity.hasPermissions(3) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.EMERALD) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				OreNodeMaxMinuteScriptProcedure.execute(world, x, y, z, entity);
			} else if (entity.hasPermissions(3) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.AMETHYST_SHARD) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				OreNodeMinMinuteScriptProcedure.execute(world, x, y, z, entity);
			} else if (entity.hasPermissions(3) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				OreNodeDamageScriptProcedure.execute(world, x, y, z, entity);
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof PickaxeItem
					&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue() + new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "Damage") < ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getMaxDamage()
					&& (blockstate.is(BlockTags.create(new ResourceLocation("northsessentials:nodes/ore/wood_tools")))
							&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof TieredItem _tierItem ? _tierItem.getTier().getLevel() : 0) >= 0
							|| blockstate.is(BlockTags.create(new ResourceLocation("northsessentials:nodes/ore/stone_tools")))
									&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof TieredItem _tierItem ? _tierItem.getTier().getLevel() : 0) >= 1
							|| blockstate.is(BlockTags.create(new ResourceLocation("northsessentials:nodes/ore/iron_tools")))
									&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof TieredItem _tierItem ? _tierItem.getTier().getLevel() : 0) >= 2
							|| blockstate.is(BlockTags.create(new ResourceLocation("northsessentials:nodes/ore/diamond_tools")))
									&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof TieredItem _tierItem ? _tierItem.getTier().getLevel() : 0) >= 3)) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				OreNodeHarvestScriptProcedure.execute(world, x, y, z, entity);
			}
		}
	}
}
