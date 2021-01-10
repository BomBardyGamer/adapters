package dev.bombardy.adapters.v1_16_R2.play;

import dev.bombardy.adapters.play.PlayAdapter;
import dev.bombardy.adapters.play.animation.AnimationType;
import net.minecraft.server.v1_16_R2.*;
import org.bukkit.Location;
import org.bukkit.Statistic;
import org.bukkit.craftbukkit.libs.it.unimi.dsi.fastutil.objects.Object2IntMaps;
import org.bukkit.craftbukkit.v1_16_R2.CraftStatistic;
import org.bukkit.craftbukkit.v1_16_R2.entity.CraftEntity;
import org.bukkit.craftbukkit.v1_16_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_16_R2.util.CraftVector;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public final class PlayAdapter_1_16_R2 implements PlayAdapter {

    @Override
    public void sendEntityAnimation(final Player player, final Entity entity, final AnimationType animation) {
        sendPacket(player, new PacketPlayOutAnimation(((CraftEntity) entity).getHandle(), animation.getId()));
    }

    @Override
    public void sendBlockBreakAnimation(final Player player, final Entity entity, final Location location, final int progress) {
        sendPacket(player, new PacketPlayOutBlockBreakAnimation(
                entity.getEntityId(),
                new BlockPosition(CraftVector.toNMS(location.toVector())),
                progress
        ));
    }

    @Override
    public void sendStatistic(final Player player, final Statistic type, final int value) {
        sendPacket(player, new PacketPlayOutStatistic(Object2IntMaps.singleton(CraftStatistic.getNMSStatistic(type), value)));
    }

    private void sendPacket(final Player player, final Packet<?> packet) {
        final PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

        connection.sendPacket(packet);
    }
}
