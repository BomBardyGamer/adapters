package dev.bombardy.adapters.login;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;

import java.security.PublicKey;

public interface LoginAdapter {

    void disconnect(final Player player, final BaseComponent... components);

    void sendEncryptionRequest(final Player player, final PublicKey key, final byte[] token);

    void setCompression(final Player player, final int threshold);
}
