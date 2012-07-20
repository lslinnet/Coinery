package gloombone.coinery;

import net.minecraft.src.ItemStack;
import net.minecraft.src.forge.IOreHandler;

public class CopperOreHandler implements IOreHandler {

	@Override
	public void registerOre(String oreClass, ItemStack ore) {
		System.out.println(oreClass.toString());
	}

}
