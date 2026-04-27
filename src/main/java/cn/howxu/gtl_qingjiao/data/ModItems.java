package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.item.CreateWrench;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/1/17 19:35
 */
public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, GTLQingJiao.MODID);
    // for CreativeTabs
    public static final List<RegistryObject<Item>> ITEMS = new LinkedList<>();
    public static final List<RegistryObject<Item>> DEFAULT_ITEMS = new LinkedList<>();

    public static final RegistryObject<Item> WRENCH_ITEM = regSpecialWithModel("wrench", CreateWrench::new);

    // for unspecial items
    private static RegistryObject<Item> regDefault(String name, Supplier<Item> sup) {
        return AddToList(REGISTER.register(name, sup), DEFAULT_ITEMS, ITEMS);
    }

    // for these have models
    private static RegistryObject<Item> regSpecialWithModel(String name, Supplier<Item> sup) {
        return AddToList(REGISTER.register(name, sup), ITEMS);
    }
    @SafeVarargs
    private static RegistryObject<Item> AddToList(RegistryObject<Item> item, List<RegistryObject<Item>>... holders) {
        Arrays.stream(holders).iterator().forEachRemaining(list -> {
            list.add(item);
        });
        return item;
    }
}
