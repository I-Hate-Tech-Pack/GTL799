package cn.howxu.gtl_qingjiao.common.item;

import cn.howxu.gtl_qingjiao.data.ModBlocks;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 18:42
 */
public class DollItem extends BlockItem {
    public DollItem() {
        super(ModBlocks.QingJiao_DOLL.get(), new Item.Properties().rarity(Rarity.EPIC));
    }

    @Override
    public void appendHoverText(ItemStack p_40572_, @Nullable Level p_40573_, List<Component> p_40574_, TooltipFlag p_40575_) {
        super.appendHoverText(p_40572_, p_40573_, p_40574_, p_40575_);
        p_40574_.add(Component.translatable("gtl_qingjiao.tip.1").withStyle(ChatFormatting.AQUA));
        p_40574_.add(Component.translatable("gtl_qingjiao.tip.2").withStyle(ChatFormatting.LIGHT_PURPLE));
    }

    @Override
    public EquipmentSlot getEquipmentSlot(ItemStack stack) {
        return EquipmentSlot.HEAD;
    }

}
