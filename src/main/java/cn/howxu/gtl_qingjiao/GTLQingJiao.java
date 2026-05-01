package cn.howxu.gtl_qingjiao;

import static cn.howxu.gtl_qingjiao.common.GTLQingJiaoRegistry.REGISTRATE;

import cn.howxu.gtl_qingjiao.common.machine.MultiBlocks;
import cn.howxu.gtl_qingjiao.common.recipe.RecipeTypes;
import cn.howxu.gtl_qingjiao.data.ModBlocks;
import cn.howxu.gtl_qingjiao.data.item.ModItems;
import cn.howxu.gtl_qingjiao.data.item.ModRegsirtyItem;
import cn.howxu.gtl_qingjiao.event.CreativeTabEvent;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 10:58
 */
@Mod(value = GTLQingJiao.MODID)
public class GTLQingJiao {

    public static final String MODID = "gtl_qingjiao";

    public static final Logger logger = LogUtils.getLogger();

    public GTLQingJiao(FMLJavaModLoadingContext context) {
        IEventBus modbus = context.getModEventBus();
        // ModItems.REGISTER.register(modbus);
        REGISTRATE.registerEventListeners(modbus);
        ModBlocks.REGISTER.register(modbus);
        ModItems.REGISTER.register(modbus);
        modbus.addListener(CreativeTabEvent::addToCreativeTab);
        modbus.addGenericListener(
            MachineDefinition.class,
            (GTCEuAPI.RegisterEvent<
                ResourceLocation,
                MachineDefinition
            > event) -> {
                MultiBlocks.init();
            }
        );
        modbus.addGenericListener(
            GTRecipeType.class,
            (GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event) -> {
                RecipeTypes.init();
            }
        );
        modbus.addGenericListener(
            CoverDefinition.class,
            (GTCEuAPI.RegisterEvent<
                ResourceLocation,
                CoverDefinition
            > event) -> {
                ModRegsirtyItem.init();
            }
        );
    }
}
