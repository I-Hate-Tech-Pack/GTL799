package cn.howxu.gtl_qingjiao.data.item;

import cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry;
import cn.howxu.gtl_qingjiao.common.item.CreateWrench;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.ToolProperty;
import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.MaterialToolTier;
import com.gregtechceu.gtceu.api.registry.registrate.CompassNode;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.utils.FormattingUtil;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Items;

import java.util.Arrays;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/5/1 09:11
 */
public class ModRegsirtyItem {

    static GTToolType WRENCH = GTToolType.WRENCH;
    static Material neutronium = GTMaterials.Neutronium;
    static MaterialToolTier tier = neutronium.getToolTier();

    public static final ItemEntry<CreateWrench> WRENCH_ITEM = GTLQingJiaoRegistry.REGISTRATE.item(
                    WRENCH.idFormat.formatted(tier.material.getName()),
                    p -> {
                        p.setNoRepair();
                        p.stacksTo(1);
                        return new CreateWrench(WRENCH, tier, neutronium, WRENCH.toolDefinition, p);
                    }
            )
            .model((ctx, provider) -> {})
            .properties(p -> p.craftRemainder(Items.AIR))
            .onRegister(item -> {
                CompassNode node = CompassNode.getOrCreate(
                        GTCompassSections.TOOLS,
                        FormattingUtil.toLowerCaseUnderscore(WRENCH.name)
                );
                node.addTag(WRENCH.itemTags.getFirst());
            })
            .tag(
                    TagUtil.createItemTag("tools/wrench", false),
                    TagUtil.createItemTag("tools/wrenches", false)
            )
            .register();
    public static void init() {

    }
}
