package cn.howxu.gtl_qingjiao.data;

import cn.howxu.gtl_qingjiao.GTLQingJiao;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/1/17 19:30
 */
@Mod.EventBusSubscriber(modid = GTLQingJiao.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // block tag first
        BlockTagsProvider blockTagsProvider = new BlockTagGenerator(
                output, lookupProvider, existingFileHelper
        );
        generator.addProvider(event.includeServer(), blockTagsProvider);

        // item tag first
        generator.addProvider(event.includeServer(), new ItemTagGenerator(
                output,
                lookupProvider,
                blockTagsProvider.contentsGetter(),
                existingFileHelper
        ));
    }
}
