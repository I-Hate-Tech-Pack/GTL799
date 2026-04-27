package cn.howxu.gtl_qingjiao.mixin.client;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.Component;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.forge.snapshots.ForgeSnapshotsMod;
import net.minecraftforge.internal.BrandingControl;
import net.minecraftforge.versions.forge.ForgeVersion;
import net.minecraftforge.versions.mcp.MCPVersion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.List;
import java.util.Optional;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 12:17
 */

// rebuild
@Mixin(value = BrandingControl.class, remap = false, priority = 2000)
public class BrandMixin {

    @Shadow
    private static List<String> brandings;

    @Inject(method = "computeBranding", at = @At(value = "INVOKE", target = "Ljava/util/List;subList(II)Ljava/util/List;",shift = At.Shift.AFTER), require = 0)
    private static void addModernFixBranding(CallbackInfo ci) {
        ImmutableList.Builder<String> builder = new ImmutableList.Builder<>();
        builder.add("Minecraft " + MCPVersion.getMCVersion() + " | " + ForgeSnapshotsMod.BRANDING_NAME + ' ' + ForgeVersion.getVersion());
        builder.add("GregTech Leisure | GTL Core 1.2.2.8");
        builder.add("Presented by howxu");
        brandings = builder.build();
    }
}
