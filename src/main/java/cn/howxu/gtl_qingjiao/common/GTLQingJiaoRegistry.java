package cn.howxu.gtl_qingjiao.common;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.world.item.CreativeModeTabs;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 11:38
 */
public class GTLQingJiaoRegistry {
    public static final GTRegistrate REGISTRATE = GTRegistrate.create(GTLQingJiao.MODID);
    static {
        REGISTRATE.defaultCreativeTab(CreativeModeTabs.COMBAT);
    }
}
