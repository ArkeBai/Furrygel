package net.mcreator.furrymod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.furrymod.world.dimension.GelFurryDimension;
import net.mcreator.furrymod.FurrymodMod;

import java.util.Map;

public class VnbProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FurrymodMod.LOGGER.warn("Failed to load dependency world for procedure Vnb!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FurrymodMod.LOGGER.warn("Failed to load dependency x for procedure Vnb!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FurrymodMod.LOGGER.warn("Failed to load dependency y for procedure Vnb!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FurrymodMod.LOGGER.warn("Failed to load dependency z for procedure Vnb!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World)
			GelFurryDimension.portal.portalSpawn((World) world, new BlockPos(x, y, z));
	}
}
