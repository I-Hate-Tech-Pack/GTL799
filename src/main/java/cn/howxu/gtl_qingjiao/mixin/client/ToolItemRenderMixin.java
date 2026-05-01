package cn.howxu.gtl_qingjiao.mixin.client;

import cn.howxu.gtl_qingjiao.common.item.CreateWrench;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.client.renderer.item.ToolItemRenderer;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/5/1 10:35
 */
@Mixin(value = ToolItemRenderer.class,remap = false)
public class ToolItemRenderMixin {

    @Inject(
            method = "create(Lnet/minecraft/world/item/Item;Lcom/gregtechceu/gtceu/api/item/tool/GTToolType;)V",
            at = @At("HEAD"),
            remap = false,
            cancellable = true
    )
    private static void yourModId$onCreateToolRenderer(Item item, GTToolType toolType, CallbackInfo ci) {
        if (item instanceof CreateWrench) ci.cancel();
    }
}
