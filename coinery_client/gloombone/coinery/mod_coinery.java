package gloombone.coinery;

import net.minecraft.src.BaseMod; //BaseMod
import net.minecraft.src.Block;
import net.minecraft.src.Item; // The item class
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader; // ModLoader

public class mod_coinery extends BaseMod {

        public static Item itemCoinCopper;

        @Override
        public String getVersion() {
                return "0.0.1";
        }

        @Override
        public void load() {
                this.addNames();
                this.registerRecipes();
        }

        private void addNames() {
                ModLoader.addName(itemCoinCopper, "Copper coin");
        }

        private void registerRecipes() {
                ModLoader.addRecipe(new ItemStack(itemCoinCopper, 2), new Object[] {
                        "X X", "+X+", "X X", 'X', Item.stick, '+', Block.cobblestone
                });
        }

        static {
                Props.initProps("coins");

                itemCoinCopper = new itemCoinCopper(Props.iCoinCopperID).setIconCoord(0, 0).setItemName("Copper coin");
        }

}
