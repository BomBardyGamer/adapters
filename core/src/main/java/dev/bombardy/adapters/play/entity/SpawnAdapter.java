package dev.bombardy.adapters.play.entity;

import org.bukkit.entity.*;

public interface SpawnAdapter {

    void spawnEntity(final Player player, final Entity entity);

    void spawnExperience(final Player player, final ExperienceOrb experience);

    void spawnLiving(final Player player, final LivingEntity entity);

    void spawnPainting(final Player player, final Painting painting);
}
