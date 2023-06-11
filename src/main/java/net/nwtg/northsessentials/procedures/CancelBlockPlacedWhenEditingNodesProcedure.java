package net.nwtg.northsessentials.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CancelBlockPlacedWhenEditingNodesProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getPlacedAgainst());
	}

	public static void execute(BlockState placedagainst) {
		execute(null, placedagainst);
	}

	private static void execute(@Nullable Event event, BlockState placedagainst) {
		if (placedagainst.is(BlockTags.create(new ResourceLocation("northessentials:nodes")))) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			}
		}
	}
}
