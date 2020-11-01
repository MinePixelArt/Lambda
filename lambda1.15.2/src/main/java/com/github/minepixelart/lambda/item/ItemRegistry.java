package com.github.minepixelart.lambda.item;

import com.github.minepixelart.lambda.item.grape.GrapeGoldCoin;
import com.github.minepixelart.lambda.item.grape.GrapeHqyzsy;
import com.github.minepixelart.lambda.item.grape.GreenGrapeWhite;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "lambda");
    public static RegistryObject<Item> grapeGoldCoin = ITEMS.register("grape_goldcoin", GrapeGoldCoin::new);
    public static RegistryObject<Item> grapeHqyzsy = ITEMS.register("grape_hqyzsy", GrapeHqyzsy::new);
    public static RegistryObject<Item> greenGrapeWhite = ITEMS.register("greengrape_white", GreenGrapeWhite::new);
}
