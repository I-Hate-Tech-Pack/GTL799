package cn.howxu.gtl_qingjiao.mixin.client;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Optional;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/2/14 15:00
 */
@Mixin(Minecraft.class)
public class GameTitleMixin {
    @Inject(method = "updateTitle()V", at = @At("HEAD"), cancellable = true)
    private void updateTitle(final CallbackInfo info) {
        info.cancel();
    }

}
