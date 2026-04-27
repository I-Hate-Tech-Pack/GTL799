package cn.howxu.gtl_qingjiao.event;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.data.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 19:25
 */
@Mod.EventBusSubscriber(modid = GTLQingJiao.MODID)
public class CreativeTabEvent {
    @SubscribeEvent
    public static void addItemToCreativeTab(BuildCreativeModeTabContentsEvent event){
        if (event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.WRENCH_ITEM);
        }
    }
}
