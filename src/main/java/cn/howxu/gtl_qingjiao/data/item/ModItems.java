package cn.howxu.gtl_qingjiao.data.item;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.item.DollItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/1/17 19:35
 */
public class ModItems {

    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, GTLQingJiao.MODID);

    public static final RegistryObject<BlockItem> QingJiao_DOLL = REGISTER.register("qingjiao", DollItem::new);
}
