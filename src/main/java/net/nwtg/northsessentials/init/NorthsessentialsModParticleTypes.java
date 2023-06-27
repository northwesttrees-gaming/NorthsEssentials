
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.northsessentials.init;

import net.nwtg.northsessentials.NorthsessentialsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class NorthsessentialsModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NorthsessentialsMod.MODID);
	public static final RegistryObject<SimpleParticleType> REDSTONE_PARTICLE = REGISTRY.register("redstone_particle", () -> new SimpleParticleType(false));
}
