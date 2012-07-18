package net.minecraft.src

import net.minecraft.src.Item;
import net.minecraft.src.forge.ITextureProvider;

public class itemCoinCopper extends Item implements ITextureProvider {
        protected itemCoinCopper(int itemID) {
                super(itemID);
                maxStackSize = 64;
        }

        @Override
        public String getTextureFile() {
                return "/resources/coins.png";
        }
}
