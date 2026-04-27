package cn.howxu.gtl_qingjiao.common.recipe;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;
import net.minecraft.resources.ResourceLocation;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 19:58
 */
public class RecipeTypes {
    public static final GTRecipeType QINGJIAO_GENERATOR_RECIPES;

    static {
        QINGJIAO_GENERATOR_RECIPES = GTRecipeTypes
                .register("qingjiao_generator", GTRecipeTypes.MULTIBLOCK)
                .setEUIO(IO.OUT)
                .setMaxIOSize(1, 0, 2, 1)
                .setSound(GTSoundEntries.FURNACE)
                .setProgressBar(GuiTextures.PROGRESS_BAR_FUSION, ProgressTexture.FillDirection.RIGHT_TO_LEFT);
    }

    public static void init(){
        // do nothing but will load the multiblocks
        GTLQingJiao.logger.info("registerRecipeTypes");
    }
}
