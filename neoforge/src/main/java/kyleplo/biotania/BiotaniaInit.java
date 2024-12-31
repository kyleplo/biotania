package kyleplo.biotania;

import net.neoforged.fml.common.Mod;

@Mod(Biotania.MOD_ID)
@SuppressWarnings("unused")
public class BiotaniaInit {
    public BiotaniaInit() {
        Biotania.LOGGER.info("Biotania for NeoForge is initializing...");

        // Call loader-agnostic init.
        Biotania.init();
    }
}
