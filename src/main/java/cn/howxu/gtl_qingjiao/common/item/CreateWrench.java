package cn.howxu.gtl_qingjiao.common.item;

import cn.howxu.gtl_qingjiao.common.Res;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/26 19:16
 */
public class CreateWrench extends Item {

    public CreateWrench(){
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, Level context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        if (InputConstants.isKeyDown(Minecraft.getInstance().getWindow().getWindow(),InputConstants.KEY_W)){
            tooltipComponents.add(Res.tooltipWithStyle("congratulation_on_track", ChatFormatting.DARK_GRAY));
        }else{
            tooltipComponents.add(Res.tooltipWithStyle("create_wrench", ChatFormatting.GRAY));
        }
    }
}
