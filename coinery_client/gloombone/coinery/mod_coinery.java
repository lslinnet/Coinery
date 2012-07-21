package gloombone.coinery;

import net.minecraft.src.BaseMod; //BaseMod 
import net.minecraft.src.Block;
import net.minecraft.src.Item; // The item class
import net.minecraft.src.ItemStack;
import net.minecraft.src.ModLoader; // ModLoader
import net.minecraft.src.forge.*;
import net.minecraft.src.forge.oredict.OreDictionary;

public class mod_coinery extends BaseMod {

  // The different coins
  public static Item itemCoinCopper;
  public static Item itemCoinTin;
  public static Item itemCoinIron;
  public static Item itemCoinBronze;
  public static Item itemCoinSilver;
  public static Item itemCoinGold;

  public static CoineryOreHandler CoineryOreHandler;

  @Override
  public String getVersion() {
    return "0.0.1";
  }

  @Override
  public void load() {
    this.addNames();

    CoineryOreHandler = new CoineryOreHandler();
    OreDictionary.registerOreHandler(CoineryOreHandler);

    this.registerRecipes();
  }

  private void addNames() {
    ModLoader.addName(itemCoinCopper, "Copper coin");
    ModLoader.addName(itemCoinTin, "Tin coin");
    ModLoader.addName(itemCoinIron, "Iron coin");
    ModLoader.addName(itemCoinBronze, "Bronze coin");
    ModLoader.addName(itemCoinSilver, "Silver coin");
    ModLoader.addName(itemCoinGold, "Gold coin");
  }

  private void registerRecipes() {
    ModLoader.addRecipe(new ItemStack(itemCoinGold, 9), new Object[] { "X", 'X', Item.goldNugget });
  }

  static {
    Props.initProps("coins");

    itemCoinCopper = new itemCoin(Props.iCoinCopperID).setIconCoord(0, 0).setItemName("Copper coin");
    itemCoinTin = new itemCoin(Props.iCoinTinID).setIconCoord(0, 0).setItemName("Tin coin");
    itemCoinIron = new itemCoin(Props.iCoinIronID).setIconCoord(0, 0).setItemName("Iron coin");
    itemCoinBronze = new itemCoin(Props.iCoinBronzeID).setIconCoord(0, 0).setItemName("Bronze coin");
    itemCoinSilver = new itemCoin(Props.iCoinSilverID).setIconCoord(0, 0).setItemName("Silver coin");
    itemCoinGold = new itemCoin(Props.iCoinGoldID).setIconCoord(0, 0).setItemName("Gold coin");
  }

}
