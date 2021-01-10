package dev.bombardy.adapters;

import dev.bombardy.adapters.login.LoginAdapter;

import java.lang.reflect.Field;
import java.util.Set;

public interface Adapter {

    Set<Capabilities> getCapabilities();

    default boolean hasCapability(final Capabilities capability) {
        return getCapabilities().contains(capability);
    }

    LoginAdapter getLoginAdapter();

//    /**
//     * Send an update to the specified player's abilities to the client
//     *
//     * @param player the player
//     * @param abilities the abilities
//     */
//    void sendAbilities(final Player player, final PlayerAbilities abilities);
//
//    /**
//     * Retrieve the abilities for the specified player
//     *
//     * @param player the player
//     * @return the player's abilities
//     */
//    PlayerAbilities getAbilities(final Player player);
//
//    /**
//     * Send a player animation to the specified player's client
//     *
//     * @param player the player
//     * @param action the animation action, can be between 0-5
//     *               see https://wiki.vg/Protocol#Entity_Animation_.28clientbound.29
//     */
//    void sendAnimation(final Player player, final int action);
//
//    void sendAttachEntity(final Player player, final Entity entity, final Entity attachedTo);
//
//    void sendBlockEvent(final Player player, final Location location, final Block block, final BlockAction<? extends ActionID, ? extends ActionValue> action);
//
//    void sendBlockBreakAnimation(final Player player, final Entity entity, final Location location, final int destroyStage);
//
//    void sendBlockChange(final Player player, final Location location);
//
//    void sendCameraLock(final Player player, final Entity entity);
//
//    void sendCameraUnlock(final Player player);
//
//    void sendMessage(final Player player, final BaseComponent... components);
//
//    void sendTextMessage(final Player player, final String message);
//
//    void sendCloseWindow(final Player player, final int closed);
//
//    void sendCollectItem(final Player player, final int count);
//
//    void sendCombatEvent(final Player player, final CombatEvent event);

    //void sendCustomPayload(final Player player, final CustomPayload payload);

    default Object getField(final Object object, final String name) {
        try {
            final Field declaredField = object.getClass().getDeclaredField(name);
            declaredField.setAccessible(true);
            return declaredField.get(object);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }

        return null;
    }

    default void updateField(final Object object, final String name, final Object value) {
        try {
            final Field declaredField = object.getClass().getDeclaredField(name);
            declaredField.setAccessible(true);
            declaredField.set(object, value);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }
}
