package cn.howxu.gtl_qingjiao.common;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 19:17
 */
public class Res {
    public static ResourceLocation rl(String reg) {
        return ResourceLocation.fromNamespaceAndPath(GTLQingJiao.MODID, reg);
    }

    public static ResourceLocation rl(String id, String reg) {
        return ResourceLocation.fromNamespaceAndPath(id, reg);
    }

    public static Component tooltip(String inner) {
        return Component.translatable(GTLQingJiao.MODID + ".tooltip." + inner);
    }

    public static Component tooltipWithStyle(String inner, ChatFormatting style) {
        return Component.translatable(GTLQingJiao.MODID + ".tooltip." + inner).withStyle(style);
    }
}
