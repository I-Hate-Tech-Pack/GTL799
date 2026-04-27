package cn.howxu.gtl_qingjiao;

import cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 08:25
 */
@GTAddon
public class GTLQingJiaoAddon implements IGTAddon {

    @Override
    public GTRegistrate getRegistrate() {
        return GTLQingJiaoRegistry.REGISTRATE;
    }

    @Override
    public void initializeAddon() {
        GTLQingJiao.logger.info("initializeAddon");
    }

    @Override
    public String addonModId() {
        return GTLQingJiao.MODID;
    }
}
