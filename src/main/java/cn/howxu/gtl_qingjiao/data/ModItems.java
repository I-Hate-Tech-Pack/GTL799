package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.tterrag.registrate.util.entry.ItemEntry;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/1/17 19:35
 */
public class ModItems {

    private static final GTToolType WRENCH = GTToolType.WRENCH;
    private static final Material Neutronium = GTCEuAPI.materialManager.getMaterial("neutronium");
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
