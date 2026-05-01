package cn.howxu.gtl_qingjiao.event;

import cn.howxu.gtl_qingjiao.data.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 19:00
 */

public class CreativeTabEvent {
    public static void addToCreativeTab(BuildCreativeModeTabContentsEvent event){
        if (event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(ModItems.QingJiao_DOLL.get());
        }
    }
}
