package gloombone.coinery;

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;

public class itemCoin extends Item implements ITextureProvider {
  protected itemCoin(int itemID) {
    super(itemID);
    maxStackSize = 64;
  }

  @Override
  public String getTextureFile() {
    return "/resources/coins.png";
  }
}
