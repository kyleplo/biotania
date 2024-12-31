package kyleplo.biotania;

import net.minecraftforge.fml.common.Mod;

@Mod(Biotania.MOD_ID)
@SuppressWarnings("unused")
public class BiotaniaInit {
    public BiotaniaInit() {
      BiotaniaInit.LOGGER.info("Biotania for Forge is initializing...");

        // Call loader-agnostic init.
        Biotania.init();
    }
}