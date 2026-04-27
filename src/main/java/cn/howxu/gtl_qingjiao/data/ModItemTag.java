package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.common.Res;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/1/17 19:20
 */
public class ModItemTag {
    public static final TagKey<Item> WRENCH_TAG_1 = ItemTags.create(Res.rl("forge", "wrenches"));
    public static final TagKey<Item> WRENCH_TAG_2 = ItemTags.create(Res.rl("forge", "tools/wrench"));

}
