package minepixelart.lambda.item;

import minepixelart.lambda.item.grape.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "lambda");
    public static RegistryObject<Item> grapeGoldCoin = ITEMS.register("grape_goldcoin", GrapeGoldCoin::new);
    public static RegistryObject<Item> grapeHqyzsy = ITEMS.register("grape_hqyzsy", GrapeHqyzsy::new);
    public static RegistryObject<Item> greenGrapeWhite = ITEMS.register("greengrape_white", GreenGrapeWhite::new);
    public static RegistryObject<Item> grapeSmoothie = ITEMS.register("grape_smoothie", GrapeSmoothie::new);
    public static RegistryObject<Item> grapeQianjiu = ITEMS.register("grape_qianjiu", GrapeQianjiu::new);
}
