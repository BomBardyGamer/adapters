package dev.bombardy.adapters.v1_16_R2.play.entity;

import dev.bombardy.adapters.play.entity.SpawnAdapter;
import net.minecraft.server.v1_16_R2.*;
import org.bukkit.craftbukkit.v1_16_R2.entity.*;
import org.bukkit.entity.*;
import org.bukkit.entity.Entity;

public final class SpawnAdapter_1_16_R2 implements SpawnAdapter {

    @Override
    public void spawnEntity(final Player player, final Entity entity) {
        sendPacket(player, new PacketPlayOutSpawnEntity(((CraftEntity) entity).getHandle()));
    }

    @Override
    public void spawnExperience(final Player player, final ExperienceOrb experience) {
        sendPacket(player, new PacketPlayOutSpawnEntityExperienceOrb(((CraftExperienceOrb) experience).getHandle()));
    }

    @Override
    public void spawnLiving(final Player player, final LivingEntity entity) {
        sendPacket(player, new PacketPlayOutSpawnEntityLiving(((CraftLivingEntity) entity).getHandle()));
    }

    @Override
    public void spawnPainting(final Player player, final Painting painting) {
        sendPacket(player, new PacketPlayOutSpawnEntityPainting(((CraftPainting) painting).getHandle()));
    }

    private void sendPacket(final Player player, final Packet<?> packet) {
        final PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

        connection.sendPacket(packet);
    }
}
