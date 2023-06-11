package net.nwtg.northsessentials.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class ElevatorBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, double hitX, double hitY, double hitZ) {
		if (entity == null)
			return;
		String tpDirection = "";
		double posY = 0;
		double posX = 0;
		double posZ = 0;
		double posDX = 0;
		double posDY = 0;
		double posDZ = 0;
		if (!world.isClientSide()) {
			if ((entity.hasPermissions(2) || entity.hasPermissions(3) || entity.hasPermissions(4) || (entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "owner"))) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FEATHER) {
				ElevatorDistanceScriptProcedure.execute(world, x, y, z, blockstate, entity, hitX, hitY, hitZ);
			} else if ((entity.hasPermissions(2) || entity.hasPermissions(3) || entity.hasPermissions(4) || (entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "owner"))) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.RED_DYE) {
				ElevatorDxScriptProcedure.execute(world, x, y, z, blockstate, entity, hitX, hitY, hitZ);
			} else if ((entity.hasPermissions(2) || entity.hasPermissions(3) || entity.hasPermissions(4) || (entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "owner"))) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GREEN_DYE) {
				ElevatorDyScriptProcedure.execute(world, x, y, z, blockstate, entity, hitX, hitY, hitZ);
			} else if ((entity.hasPermissions(2) || entity.hasPermissions(3) || entity.hasPermissions(4) || (entity.getDisplayName().getString()).equals(new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "owner"))) && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BLUE_DYE) {
				ElevatorDzScriptProcedure.execute(world, x, y, z, blockstate, entity, hitX, hitY, hitZ);
			} else {
				ElevatorUseScriptProcedure.execute(world, x, y, z, blockstate, entity, hitX, hitY, hitZ);
			}
		}
	}
}
