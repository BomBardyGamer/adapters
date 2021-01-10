package dev.bombardy.adapters.play.animation;

public enum AnimationType {

    SWING_MAIN_ARM(0),
    TAKE_DAMAGE(1),
    LEAVE_BED(2),
    SWING_OFFHAND(3),
    CRITICAL_EFFECT(4),
    MAGIC_CRITICAL_EFFECT(5);

    private final int id;

    AnimationType(final int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
