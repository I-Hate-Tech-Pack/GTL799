package cn.howxu.gtl_qingjiao.data.recipe;

import cn.howxu.gtl_qingjiao.common.recipe.RecipeTypes;
import cn.howxu.gtl_qingjiao.data.item.ModItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/30 13:03
 */
public class MultiBlockRecipes {
    public static void init(Consumer<FinishedRecipe> consumer){
        RecipeTypes.QINGJIAO_GENERATOR_RECIPES.recipeBuilder("light_1")
                .notConsumable(ModItems.QingJiao_DOLL.get()) // 799 玩偶
                .inputFluids(GTMaterials.Oxygen.getFluid(799)) // 799 氧气
                .inputFluids(GTMaterials.Water.getFluid(Integer.MAX_VALUE)) // 2.1g 水
                .EUt(-(GTValues.VEX[GTValues.MAX_TRUE] - 1)) // 输出Long最大值EU
                .duration(799 * 20)
                .save(consumer);

        RecipeTypes.QINGJIAO_GENERATOR_RECIPES.recipeBuilder("light_2")
                .notConsumable(ModItems.QingJiao_DOLL.get()) // 799 玩偶
                .inputFluids(GTMaterials.Steam.getFluid(799)) // 799 蒸汽
                .inputFluids(GTMaterials.Water.getFluid(Integer.MAX_VALUE)) // 2.1g 水
                .EUt( -(GTValues.VEX[GTValues.MAX] - 1)) // 输出Int最大值EU
                .duration(799 * 20)
                .save(consumer);
    }
}
