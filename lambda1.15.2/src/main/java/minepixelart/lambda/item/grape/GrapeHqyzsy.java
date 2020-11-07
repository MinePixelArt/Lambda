package minepixelart.lambda.item.grape;

import minepixelart.lambda.item.GroupRegistry;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
// Hqyzsy
public class GrapeHqyzsy extends Item {
    private static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .build();

    public GrapeHqyzsy() {
        super(new Properties().food(food).group(GroupRegistry.grapeGroup));
    }
}
