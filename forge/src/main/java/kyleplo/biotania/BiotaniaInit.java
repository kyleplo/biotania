package kyleplo.biotania;

import net.minecraftforge.fml.common.Mod;

@Mod(Biotania.MOD_ID)
public class BiotaniaInit {
    public BiotaniaInit() {
        // Call loader-agnostic init.
        Biotania.init();
    }
}