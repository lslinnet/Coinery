package gloombone.coinery;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.src.forge.Configuration;

public class Props {

        // Configuration, used for save and load data
        public static Configuration config;

        public static int iCoinCopperID;

        public static void initProps(String mod) {

                // Creating a folder for the mod in the folder config within the minecraft folder.
                File file = new File(Minecraft.getMinecraftDir() + "/config/" + mod);
                file.mkdir(); // create the folder.

                // getting the config file
                File newFile = new File(Minecraft.getMinecraftDir() + "/config/" + mod + "main.cfg");

                // Try to create the config file
                try {
                        newFile.createNewFile();
                        System.out.println("Successfully created/read configuration file");
                }
                catch (IOException e) {
                        System.out.println("Could not create configuration file for mod_coins. Reason:");
                        System.out.println(e);
                }

                // Allocate the file to the config
                config = new Configuration(newFile);

                // load the data
                config.load();

                // Custom confis - start
                iCoinCopperID = config.getOrCreateIntProperty("itemCopperCoin", "item", 7321).getInt(7321);
                // Custom confis - end
                // save the data
                config.save();

        }
}
