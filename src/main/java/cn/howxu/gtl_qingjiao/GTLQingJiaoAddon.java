package cn.howxu.gtl_qingjiao;

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
        return GTLQingJiao.REGISTRATE;
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
