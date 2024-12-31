package kyleplo.biotania;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class BiotaniaBiomeKeys {
    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Biotania.MOD_ID, name));
    }

    public static final RegistryKey<Biome> METAMORPHIC_CAVES = register("metamorphic_caves");
    public static final RegistryKey<Biome> MYSTICAL_FOREST = register("mystical_forest");
    public static final RegistryKey<Biome> SHATTERED_WASTELAND = register("shattered_wasteland");
    public static final RegistryKey<Biome> BOTANICAL_FIELDS = register("botanical_fields");
    public static final RegistryKey<Biome> FEL_FIELDS = register("fel_fields");
}
