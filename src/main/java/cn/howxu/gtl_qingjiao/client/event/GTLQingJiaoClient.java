package cn.howxu.gtl_qingjiao.client.event;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.integration.CuriosExtension;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 15:12
 */
@Mod.EventBusSubscriber(modid = GTLQingJiao.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GTLQingJiaoClient {
    // On game start
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        event.enqueueWork(()->{
            Minecraft.getInstance().getWindow().setTitle("GregTech Leisure | 799BEST");
        });
    }
    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void addEntityLayers(EntityRenderersEvent.AddLayers event) {
        CuriosExtension.addEntityLayers(event);
    }

}
