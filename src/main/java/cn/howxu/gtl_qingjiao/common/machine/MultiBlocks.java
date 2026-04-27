package cn.howxu.gtl_qingjiao.common.machine;


import cn.howxu.gtl_qingjiao.GTLQingJiao;

import cn.howxu.gtl_qingjiao.common.machine.define.QingJiaoGeneratorDefination;
import cn.howxu.gtl_qingjiao.common.recipe.RecipeTypes;
import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.RotationState;
import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;
import com.gregtechceu.gtceu.api.machine.multiblock.PartAbility;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.FactoryBlockPattern;
import com.gregtechceu.gtceu.api.pattern.Predicates;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.gregtechceu.gtceu.common.registry.GTRegistration;
import net.minecraft.world.level.block.Blocks;

import static cn.howxu.gtl_qingjiao.GTLQingJiao.REGISTRATE;
import static com.gregtechceu.gtceu.api.machine.multiblock.PartAbility.*;
import static com.gregtechceu.gtceu.api.pattern.Predicates.*;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 19:58
 */
public class MultiBlocks {
    public static final MultiblockMachineDefinition ANNIHILATE_GENERATOR;

    static {
        ANNIHILATE_GENERATOR = GTRegistration.REGISTRATE
                .multiblock("qingjiao_generator", WorkableElectricMultiblockMachine::new)
                .rotationState(RotationState.NON_Y_AXIS).recipeType(RecipeTypes.QINGJIAO_GENERATOR_RECIPES)
                .generator(true)
                .appearanceBlock(GTBlocks.HIGH_POWER_CASING)
                .workableCasingRenderer(GTCEu.id("block/casings/hpca/high_power_casing"),GTCEu.id(("block/multiblock/fusion_reactor")))
                .pattern(QingJiaoGeneratorDefination.getPattern())
                .hasTESR(true)
                .register();
    }

    public static void init(){
        // do nothing but will load the multiblocks
        GTLQingJiao.logger.info("registerMachines");
    }
}
