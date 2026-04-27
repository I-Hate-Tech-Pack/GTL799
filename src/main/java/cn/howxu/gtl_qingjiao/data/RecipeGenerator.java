package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.Res;
import cn.howxu.gtl_qingjiao.common.recipe.RecipeTypes;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 18:28
 */

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        RecipeTypes.QINGJIAO_GENERATOR_RECIPES.recipeBuilder("light_1")
                .notConsumable(ModItems.QingJiao_DOLL.get()) // 799 玩偶
                .inputFluids(GTMaterials.Oxygen.getFluid(799)) // 799 氧气
                .inputFluids(GTMaterials.Water.getFluid(Integer.MAX_VALUE)) // 2.1g 水
                .EUt(-(Long.MAX_VALUE - 1)) // 输出Long最大值EU
                .duration(5)
                .save(consumer);

        RecipeTypes.QINGJIAO_GENERATOR_RECIPES.recipeBuilder("light_2")
                .notConsumable(ModItems.QingJiao_DOLL.get()) // 799 玩偶
                .inputFluids(GTMaterials.Steam.getFluid(799)) // 799 蒸汽
                .inputFluids(GTMaterials.Water.getFluid(Integer.MAX_VALUE)) // 2.1g 水
                .EUt(-(Integer.MAX_VALUE - 1)) // 输出Int最大值EU
                .duration(5)
                .save(consumer);

        RecipeTypes.QINGJIAO_GENERATOR_RECIPES.recipeBuilder("steam")
                .notConsumable(ModItems.QingJiao_DOLL.get()) // 799 玩偶
                .inputFluids(GTMaterials.Water.getFluid(799)) // 799 水
                .inputFluids(GTMaterials.Water.getFluid(Integer.MAX_VALUE)) // 2.1g 水
                .outputFluids(GTMaterials.Steam.getFluid(Integer.MAX_VALUE * 799L)) // 输出Long最大值 蒸汽
                .duration(5)
                .save(consumer);

        // 799
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QingJiao_DOLL.get())
                .unlockedBy("has_food", has(ItemTags.FOX_FOOD))
                .group(GTLQingJiao.MODID)
                .pattern("EAE")
                .pattern("ABA")
                .pattern("CAC")
                .define('A', ItemTags.WOOL)
                .define('B', ItemTags.PLANKS)
                .define('C', Items.DIAMOND)
                .define('E', ItemTags.FOX_FOOD)
                .save(consumer);

        // wrench
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WRENCH_ITEM.get())
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .group(GTLQingJiao.MODID)
                .pattern("BC ")
                .pattern("CB ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ItemTags.PLANKS)
                .define('C', Items.IRON_INGOT)
                .save(consumer);

        // controller
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, Objects.requireNonNull(ForgeRegistries.BLOCKS.getValue(Res.rl("qingjiao_generator"))).asItem())
                .unlockedBy("has_799", has(ModItems.QingJiao_DOLL.get()))
                .group(GTLQingJiao.MODID)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .define('A', Items.IRON_TRAPDOOR)
                .define('B', ModItems.QingJiao_DOLL.get())
                .save(consumer);
    }
}
