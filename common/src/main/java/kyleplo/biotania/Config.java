package kyleplo.biotania;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;

import com.google.gson.GsonBuilder;

public class Config {
    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private static String currentVersion = "1.0.1";

    //Config Default Values

    public String CONFIG_VERSION_DO_NOT_TOUCH_PLS = currentVersion;

    public boolean logWhenLoaded = true;
    public String comment = "Enable or disable any biome individually.";
    public boolean generateMetamorphicCaves = true;
    public boolean generateMysticalForest = true;
    public boolean generateShatteredWastes = true;
    public boolean generatePetalPastures = true;
    public boolean generateFelFields = true;

    public static Config init() {
        Config config = null;

        try {
            Path configPath = Paths.get("", "config", "biotania.json");

            if (Files.exists(configPath)) {
                config = gson.fromJson(
                    new FileReader(configPath.toFile()),
                    Config.class
                );

                if (!config.CONFIG_VERSION_DO_NOT_TOUCH_PLS.equals(currentVersion)) {
                    config.CONFIG_VERSION_DO_NOT_TOUCH_PLS = currentVersion;

                    BufferedWriter writer = new BufferedWriter(
                        new FileWriter(configPath.toFile())
                    );

                    writer.write(gson.toJson(config));
                    writer.close();
                }

            } else {
                config = new Config();
                Paths.get("", "config").toFile().mkdirs();

                BufferedWriter writer = new BufferedWriter(
                    new FileWriter(configPath.toFile())
                );

                writer.write(gson.toJson(config));
                writer.close();
            }


        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return config;
    }
}
