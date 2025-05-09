package kyleplo.biotania;

import net.fabricmc.api.ModInitializer;

public class BiotaniaInit  implements ModInitializer {
    @Override
    public void onInitialize() {
        // Call loader-agnostic init.
        Biotania.init();
    }
}
