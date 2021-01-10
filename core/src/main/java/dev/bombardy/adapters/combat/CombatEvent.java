package dev.bombardy.adapters.combat;

public class CombatEvent {

    private final CombatEventType type;

    public CombatEvent(final CombatEventType type) {
        this.type = type;
    }

    public final CombatEventType getType() {
        return type;
    }

    public enum CombatEventType {

        ENTER_COMBAT,
        END_COMBAT,
        ENTITY_DIED;
    }
}
