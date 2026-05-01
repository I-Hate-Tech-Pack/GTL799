package cn.howxu.gtl_qingjiao.data.recipe;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.Res;
import cn.howxu.gtl_qingjiao.data.item.ModItems;
import cn.howxu.gtl_qingjiao.data.item.ModRegsirtyItem;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
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
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModRegsirtyItem.WRENCH_ITEM.get())
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
