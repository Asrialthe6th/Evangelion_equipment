package net.asrialthe6th.evangelion.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab EVANGELION_TAB = new CreativeModeTab("evangeliontab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.S2_DRIVE.get());
        }
    };
}
