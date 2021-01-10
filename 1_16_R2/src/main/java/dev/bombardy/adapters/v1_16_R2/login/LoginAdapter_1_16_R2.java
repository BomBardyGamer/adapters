package dev.bombardy.adapters.v1_16_R2.login;

import dev.bombardy.adapters.login.LoginAdapter;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import net.minecraft.server.v1_16_R2.*;
import org.bukkit.craftbukkit.v1_16_R2.CraftServer;
import org.bukkit.craftbukkit.v1_16_R2.CraftWorld;
import org.bukkit.craftbukkit.v1_16_R2.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_16_R2.util.CraftChatMessage;
import org.bukkit.entity.Player;

import java.security.PublicKey;

public final class LoginAdapter_1_16_R2 implements LoginAdapter {

    @Override
    public void disconnect(final Player player, final BaseComponent... components) {
        sendPacket(player, new PacketLoginOutDisconnect(CraftChatMessage.fromStringOrNull(ComponentSerializer.toString(components))));
    }

    @Override
    public void sendEncryptionRequest(final Player player, final PublicKey key, final byte[] token) {
        sendPacket(player, new PacketLoginOutEncryptionBegin(player.getServer().getName(), key, token));
    }

    @Override
    public void setCompression(final Player player, final int threshold) {
        sendPacket(player, new PacketLoginOutSetCompression(threshold));
    }

    private void sendPacket(final Player player, final Packet<?> packet) {
        final PlayerConnection connection = ((CraftPlayer) player).getHandle().playerConnection;

        connection.sendPacket(packet);
    }
}
