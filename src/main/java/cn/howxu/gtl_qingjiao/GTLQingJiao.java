package cn.howxu.gtl_qingjiao;

import cn.howxu.gtl_qingjiao.common.machine.MultiBlocks;
import cn.howxu.gtl_qingjiao.common.recipe.RecipeTypes;
import cn.howxu.gtl_qingjiao.data.ModItems;
import com.gregtechceu.gtceu.api.GTCEuAPI;
import com.gregtechceu.gtceu.api.machine.MachineDefinition;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.data.GTCreativeModeTabs;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
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
    public static final GTRegistrate REGISTRATE = GTRegistrate.create(GTLQingJiao.MODID);
    public static final Logger logger = LogUtils.getLogger();

    public GTLQingJiao(FMLJavaModLoadingContext context){
        IEventBus modbus = context.getModEventBus();
        ModItems.REGISTER.register(modbus);
        REGISTRATE.registerEventListeners(modbus);
        modbus.addGenericListener(MachineDefinition.class, (GTCEuAPI.RegisterEvent<ResourceLocation, MachineDefinition> event)-> {
            MultiBlocks.init();
        });
        modbus.addGenericListener(GTRecipeType.class, (GTCEuAPI.RegisterEvent<ResourceLocation, GTRecipeType> event)-> {
            RecipeTypes.init();

        });
    }
}
