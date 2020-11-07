package minepixelart.lambda.item.grape;

import minepixelart.lambda.item.GroupRegistry;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
// qianjiu
public class GrapeQianjiu extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .build();
    public GrapeQianjiu() {
        super(new Properties().food(food).group(GroupRegistry.grapeGroup));
    }
}
