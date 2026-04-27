package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import cn.howxu.gtl_qingjiao.common.block.Doll;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/27 16:57
 */
public class ModBlocks {

    public static final DeferredRegister<Block> REGISTER = DeferredRegister.create(ForgeRegistries.BLOCKS, GTLQingJiao.MODID);

    public static final RegistryObject<Block> QingJiao_DOLL = REGISTER.register("qingjiao", Doll::new);

}
