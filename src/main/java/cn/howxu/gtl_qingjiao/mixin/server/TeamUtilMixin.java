package cn.howxu.gtl_qingjiao.mixin.server;

import com.hepdd.gtmthings.utils.TeamUtil;
import com.lowdragmc.lowdraglib.LDLib;
import dev.ftb.mods.ftbteams.api.FTBTeamsAPI;
import dev.ftb.mods.ftbteams.api.Team;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Optional;
import java.util.UUID;

/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/4/30 13:34
 */
@Mixin(value = TeamUtil.class, remap = false)
public abstract class TeamUtilMixin {

    /**
     * @author howxu
     * @reason fix
     */
    @Overwrite
    public static Component GetName(Player player) {
        if (LDLib.isModLoaded("ftbteams") && FTBTeamsAPI.api().isManagerLoaded()) {
            // from https://github.com/liansishen/GTMThings/pull/59/changes/b4c084b28d9776bee0f5ba50682aca7c410604b9
            Optional<Team> team = FTBTeamsAPI.api().getManager().getTeamForPlayerID(player.getUUID());
            if (team.isPresent()) return team.get().getName();
        }
        return player.getName();
    }


    /**
     * @author howxu
     * @reason fix
     */
    @Overwrite
    public static Component GetName(Level level, UUID playerUUID) {
        // from https://github.com/liansishen/GTMThings/pull/59/changes/b4c084b28d9776bee0f5ba50682aca7c410604b9
        if (LDLib.isModLoaded("ftbteams") && FTBTeamsAPI.api().isManagerLoaded()) {
            var team = FTBTeamsAPI.api().getManager().getTeamForPlayerID(playerUUID);
            if (team.isPresent()) {
                return team.get().getName();
            }
        }
        Player player = level.getPlayerByUUID(playerUUID);
        if (player != null) return player.getName();
        return Component.literal(playerUUID.toString());
    }
}
