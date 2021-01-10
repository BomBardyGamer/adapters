package dev.bombardy.adapters.packets;

public final class PlayerAbilities {

    private boolean isInvulnerable;
    private boolean isFlying;
    private boolean canFly;
    private boolean canInstantlyBuild;
    private boolean canBuild;
    private float flyingSpeed;
    private float walkingSpeed;

    public PlayerAbilities() {
        isInvulnerable = false;
        isFlying = false;
        canFly = false;
        canInstantlyBuild = false;
        canBuild = false;
        flyingSpeed = 0.0f;
        walkingSpeed = 0.0f;
    }

    public PlayerAbilities(final boolean isInvulnerable, final boolean isFlying, final boolean canFly, final boolean canInstantlyBuild, final boolean canBuild, final float flyingSpeed, final float walkingSpeed) {
        this.isInvulnerable = isInvulnerable;
        this.isFlying = isFlying;
        this.canFly = canFly;
        this.canInstantlyBuild = canInstantlyBuild;
        this.canBuild = canBuild;
        this.flyingSpeed = flyingSpeed;
        this.walkingSpeed = walkingSpeed;
    }

    public boolean isInvulnerable() {
        return isInvulnerable;
    }

    public void setInvulnerable(final boolean invulnerable) {
        isInvulnerable = invulnerable;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(final boolean flying) {
        isFlying = flying;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(final boolean canFly) {
        this.canFly = canFly;
    }

    public boolean canInstantlyBuild() {
        return canInstantlyBuild;
    }

    public void setInstantlyBuild(final boolean canInstantlyBuild) {
        this.canInstantlyBuild = canInstantlyBuild;
    }

    public boolean canBuild() {
        return canBuild;
    }

    public void setCanBuild(final boolean canBuild) {
        this.canBuild = canBuild;
    }

    public float getFlyingSpeed() {
        return flyingSpeed;
    }

    public void setFlyingSpeed(final float flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public float getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(final float walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }
}
