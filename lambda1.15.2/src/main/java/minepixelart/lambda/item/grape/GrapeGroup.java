package minepixelart.lambda.item.grape;

import minepixelart.lambda.item.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GrapeGroup extends ItemGroup {
    public GrapeGroup() {
        super("grape_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.grapeGoldCoin.get());
    }
}
