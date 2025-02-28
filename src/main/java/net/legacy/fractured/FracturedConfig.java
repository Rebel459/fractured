package net.legacy.fractured;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import net.fabricmc.loader.api.FabricLoader;

public class FracturedConfig {

    public static boolean generate_eyes_in_frames;
    public static int stronghold_eye_chance;
    public static int abandoned_mineshaft_eye_chance;
    public static int desert_pyramid_eye_chance;
    public static int jungle_temple_eye_chance;
    public static int nether_fortress_eye_chance;
    public static int shipwreck_eye_chance;
    public static int igloo_eye_chance;
    public static int dungeon_eye_chance;
    public static int woodland_mansion_eye_chance;
    public static int pillager_outpost_eye_chance;
    public static int bastion_remnant_eye_chance;
    public static int ocean_ruins_eye_chance;
    public static int ruined_portal_eye_chance;
    public static int ancient_city_eye_chance;
    public static int buried_treasure_eye_chance;

    public FracturedConfig() {
    }

    public static void main() throws IOException {
        Path configPath = Path.of(FabricLoader.getInstance().getConfigDir().toString(), "fractured-config-v1.json");

        try {
            JsonObject obj;
            if (configPath.toFile().createNewFile()) {
                obj = getJsonObject();
                PrintWriter pw = new PrintWriter(configPath.toString());
                Gson gson = (new GsonBuilder()).setPrettyPrinting().create();
                pw.print(gson.toJson(obj));
                pw.flush();
                pw.close();
            }

            obj = (JsonObject)JsonParser.parseReader(new FileReader(configPath.toString()));
            JsonObject config = (JsonObject)obj.get("config");
            generate_eyes_in_frames = config.get("generate_eyes_in_frames").getAsBoolean();
            stronghold_eye_chance = config.get("stronghold_eye_chance").getAsInt();
            abandoned_mineshaft_eye_chance = config.get("abandoned_mineshaft_eye_chance").getAsInt();
            desert_pyramid_eye_chance = config.get("desert_pyramid_eye_chance").getAsInt();
            jungle_temple_eye_chance = config.get("jungle_temple_eye_chance").getAsInt();
            nether_fortress_eye_chance = config.get("nether_fortress_eye_chance").getAsInt();
            shipwreck_eye_chance = config.get("shipwreck_eye_chance").getAsInt();
            igloo_eye_chance = config.get("igloo_eye_chance").getAsInt();
            dungeon_eye_chance = config.get("dungeon_eye_chance").getAsInt();
            woodland_mansion_eye_chance = config.get("woodland_mansion_eye_chance").getAsInt();
            pillager_outpost_eye_chance = config.get("pillager_outpost_eye_chance").getAsInt();
            bastion_remnant_eye_chance = config.get("bastion_remnant_eye_chance").getAsInt();
            ocean_ruins_eye_chance = config.get("ocean_ruins_eye_chance").getAsInt();
            ruined_portal_eye_chance = config.get("ruined_portal_eye_chance").getAsInt();
            ancient_city_eye_chance = config.get("ancient_city_eye_chance").getAsInt();
            buried_treasure_eye_chance = config.get("buried_treasure_eye_chance").getAsInt();
        } catch (IOException var4) {
            System.err.println("An error occurred, delete the fractured config file in your config/ folder and relaunch");
        }

    }

    private static JsonObject getJsonObject() {
        JsonObject jsonObjects = new JsonObject();
        JsonObject configObject = new JsonObject();
        configObject.addProperty("generate_eyes_in_frames", true);
        configObject.addProperty("stronghold_eye_chance", 5);
        configObject.addProperty("abandoned_mineshaft_eye_chance", 25);
        configObject.addProperty("desert_pyramid_eye_chance", 15);
        configObject.addProperty("jungle_temple_eye_chance", 20);
        configObject.addProperty("nether_fortress_eye_chance", 20);
        configObject.addProperty("shipwreck_eye_chance", 5);
        configObject.addProperty("igloo_eye_chance", 25);
        configObject.addProperty("dungeon_eye_chance", 25);
        configObject.addProperty("woodland_mansion_eye_chance", 10);
        configObject.addProperty("pillager_outpost_eye_chance", 5);
        configObject.addProperty("bastion_remnant_eye_chance", 5);
        configObject.addProperty("ocean_ruins_eye_chance", 5);
        configObject.addProperty("ruined_portal_eye_chance", 5);
        configObject.addProperty("ancient_city_eye_chance", 5);
        configObject.addProperty("buried_treasure_eye_chance", 20);
        jsonObjects.add("config", configObject);
        return jsonObjects;
    }
}
