
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nwtg.northsessentials.init;

import net.nwtg.northsessentials.client.particle.RedstoneParticleParticle;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NorthsessentialsModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(NorthsessentialsModParticleTypes.REDSTONE_PARTICLE.get(), RedstoneParticleParticle::provider);
	}
}
