package dev.bombardy.adapters.play;

import dev.bombardy.adapters.play.animation.AnimationType;
import org.bukkit.Location;
import org.bukkit.Statistic;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface PlayAdapter {

    void sendEntityAnimation(final Player player, final Entity entity, final AnimationType animation);

    void sendStatistic(final Player player, final Statistic type, final int value);

    void sendBlockBreakAnimation(final Player player, final Entity entity, final Location position, final int progress);
}
