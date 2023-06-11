package net.nwtg.northsessentials.procedures;

import net.nwtg.northsessentials.init.NorthsessentialsModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class OreNodeHarvestScriptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "NodeType")).contains("S")) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = NorthsessentialsModBlocks.EMPTY_NODE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "NodeType")).contains("D")) {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = NorthsessentialsModBlocks.EMPTY_DEEPSLATE_NODE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else {
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = NorthsessentialsModBlocks.EMPTY_NETHER_NODE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = new BlockPos(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null)
				_blockEntity.getPersistentData().putDouble("Time", (Mth.nextInt(RandomSource.create(), (int) (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "MinMinutes")), (int) (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos(x, y, z), "MaxMinutes"))) * 60));
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		{
			ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (_ist.hurt((int) (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "Damage")), RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if ((new Object() {
			public String getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getString(tag);
				return "";
			}
		}.getValue(world, new BlockPos(x, y, z), "NodeType")).contains("10")) {
			if (!world.isClientSide()) {
				OreNodeHarvestDropScriptProcedure.execute(world, x, y, z, entity);
			}
		} else {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
				for (int index0 = 0; index0 < (int) (Mth.nextInt(RandomSource.create(), 1, 2)
						* EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) + 1); index0++) {
					if (!world.isClientSide()) {
						OreNodeHarvestDropScriptProcedure.execute(world, x, y, z, entity);
					}
				}
			} else {
				if (!world.isClientSide()) {
					OreNodeHarvestDropScriptProcedure.execute(world, x, y, z, entity);
				}
			}
		}
		if (!world.isClientSide()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_OFF, (x + 0.5), (y + 0.5), (z + 0.5), 8, 0.5, 0.5, 0.5, 0.25);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.break")), SoundSource.BLOCKS, 1, (float) 0.8);
				} else {
					_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_block.break")), SoundSource.BLOCKS, 1, (float) 0.8, false);
				}
			}
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "NodeType")).contains("S")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8, false);
					}
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getString(tag);
					return "";
				}
			}.getValue(world, new BlockPos(x, y, z), "NodeType")).contains("D")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8, false);
					}
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x + 0.5, y + 0.5, z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.netherrack.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8);
					} else {
						_level.playLocalSound((x + 0.5), (y + 0.5), (z + 0.5), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.netherrack.break")), SoundSource.BLOCKS, (float) 0.9, (float) 0.8, false);
					}
				}
			}
		}
	}
}
