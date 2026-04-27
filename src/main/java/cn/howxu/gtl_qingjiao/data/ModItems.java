package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry;
import cn.howxu.gtl_qingjiao.common.block.Doll;
import cn.howxu.gtl_qingjiao.common.item.DollItem;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    public static final ItemEntry<ComponentItem> WRENCH_ITEM = GTLQingJiaoRegistry.REGISTRATE
            .item("wrench", ComponentItem::create)
            .tag(
                    TagUtil.createItemTag("tools/wrench", false),
                    TagUtil.createItemTag("tools/wrenches", false)
            )
            .properties(p -> p.stacksTo(1).durability(0).setNoRepair())
            .register();

    public static void init() {

    }
}
