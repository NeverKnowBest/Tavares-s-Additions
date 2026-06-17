package net.mcreator.tavaressadditions.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.tavaressadditions.init.TavaressAdditionsModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements TavaressAdditionsModBiomes.TavaressAdditionsModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> tavaress_additions_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.tavaress_additions_dimensionTypeReference != null) {
			retval = TavaressAdditionsModBiomes.adaptSurfaceRule(retval, this.tavaress_additions_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void settavaress_additionsDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.tavaress_additions_dimensionTypeReference = dimensionType;
	}
}