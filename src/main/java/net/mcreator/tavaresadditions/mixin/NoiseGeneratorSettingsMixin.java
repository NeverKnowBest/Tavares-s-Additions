package net.mcreator.tavaresadditions.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.tavaresadditions.init.TavaresAdditionsModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements TavaresAdditionsModBiomes.TavaresAdditionsModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> tavares_additions_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.tavares_additions_dimensionTypeReference != null) {
			retval = TavaresAdditionsModBiomes.adaptSurfaceRule(retval, this.tavares_additions_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void settavares_additionsDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.tavares_additions_dimensionTypeReference = dimensionType;
	}
}