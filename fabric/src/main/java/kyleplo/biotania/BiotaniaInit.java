package kyleplo.biotania;

import net.fabricmc.api.ModInitializer;

public class BiotaniaInit  implements ModInitializer {
    @Override
    public void onInitialize() {
        Biotania.LOGGER.info("Biotania for Fabric is initializing...");

        // Call loader-agnostic init.
        Biotania.init();
    }
}
