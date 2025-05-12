package kyleplo.biotania;

import com.terraformersmc.biolith.api.biome.BiomePlacement;

import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import net.minecraft.world.biome.source.util.MultiNoiseUtil.ParameterRange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Biotania {
  public static final String MOD_ID = "biotania";
  public static final String MOD_NAME = "Biotania";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void init() {
    Biotania.LOGGER.info("Registering Biotania biomes...");

    final ParameterRange FULL_RANGE = MultiNoiseUtil.ParameterRange.of(-1.0f, 1.0f);

    Config config = Config.init();

    if (config.generateMetamorphicCaves) {
      BiomePlacement.addOverworld(BiotaniaBiomeKeys.METAMORPHIC_CAVES,
        new MultiNoiseUtil.NoiseHypercube(
          MultiNoiseUtil.ParameterRange.of(0.2f, 0.55f),
          FULL_RANGE,
          FULL_RANGE,
          FULL_RANGE,
          MultiNoiseUtil.ParameterRange.of(0.2f, 0.9f),
          MultiNoiseUtil.ParameterRange.of(0.6f, 0.8f),
          0L));
    }
    if (config.generateMysticalForest) {
      BiomePlacement.replaceOverworld(BiomeKeys.FOREST, BiotaniaBiomeKeys.MYSTICAL_FOREST, 0.2);
    }
    if (config.generatePetalPastures) {
      BiomePlacement.replaceOverworld(BiomeKeys.PLAINS, BiotaniaBiomeKeys.BOTANICAL_FIELDS, 0.25);
    }
    if (config.generateShatteredWastes) {
      BiomePlacement.replaceOverworld(BiomeKeys.SAVANNA, BiotaniaBiomeKeys.SHATTERED_WASTELAND, 0.25);
    }
    if (config.generateFelFields) {
      BiomePlacement.addNether(BiotaniaBiomeKeys.FEL_FIELDS,
        new MultiNoiseUtil.NoiseHypercube(
          MultiNoiseUtil.ParameterRange.of(0.3f),
          MultiNoiseUtil.ParameterRange.of(-0.3f),
          FULL_RANGE,
          FULL_RANGE,
          FULL_RANGE,
          FULL_RANGE,
          0L));
    }

    Biotania.LOGGER.info("Biotania biomes registered!");
  }
}
