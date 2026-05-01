package cn.howxu.gtl_qingjiao;

import cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry;
import cn.howxu.gtl_qingjiao.data.recipe.MultiBlockRecipes;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.addon.IGTAddon;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

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

    @Override
    public void addRecipes(Consumer<FinishedRecipe> provider) {
        IGTAddon.super.addRecipes(provider);
        MultiBlockRecipes.init(provider);
    }
}
