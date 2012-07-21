package gloombone.coinery;

import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.src.forge.IOreHandler;

public class CoineryOreHandler implements IOreHandler {

	@Override
	public void registerOre(String oreClass, ItemStack ore) {
		System.out.println(oreClass.toString());
		if (oreClass == "ingotCopper") {
	        ModLoader.addRecipe(new ItemStack(itemCoinCopper, 9), new Object[] {
	            "X", 'X', ore
	        });			
		}
		if (oreClass == "ingotTin") {
	        ModLoader.addRecipe(new ItemStack(itemCoinTin, 9), new Object[] {
	            "X", 'X', ore
	        });
		}
	}
}
