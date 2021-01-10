package dev.bombardy.adapters.block;

public enum PistonBlockAction implements BlockAction<PistonState, PistonFacing> {

    EXTEND_UP(PistonState.EXTENDED, PistonFacing.UP),
    EXTEND_DOWN(PistonState.EXTENDED, PistonFacing.DOWN),
    EXTEND_NORTH(PistonState.EXTENDED, PistonFacing.NORTH),
    EXTEND_SOUTH(PistonState.EXTENDED, PistonFacing.SOUTH),
    EXTEND_EAST(PistonState.EXTENDED, PistonFacing.EAST),
    EXTEND_WEST(PistonState.EXTENDED, PistonFacing.WEST),

    RETRACT_UP(PistonState.RETRACTED, PistonFacing.UP),
    RETRACT_DOWN(PistonState.RETRACTED, PistonFacing.DOWN),
    RETRACT_NORTH(PistonState.RETRACTED, PistonFacing.NORTH),
    RETRACT_SOUTH(PistonState.RETRACTED, PistonFacing.SOUTH),
    RETRACT_EAST(PistonState.RETRACTED, PistonFacing.EAST),
    RETRACT_WEST(PistonState.RETRACTED, PistonFacing.WEST);

    private final PistonState state;
    private final PistonFacing facing;

    PistonBlockAction(final PistonState state, final PistonFacing facing) {
        this.state = state;
        this.facing = facing;
    }


    @Override
    public PistonState getActionID() {
        return state;
    }

    @Override
    public PistonFacing getActionValue() {
        return facing;
    }
}

enum PistonState implements BlockAction.ActionID {

    EXTENDED(1),
    RETRACTED(0);

    private final int id;

    PistonState(final int id) {
        this.id = id;
    }


    @Override
    public int getID() {
        return id;
    }
}

enum PistonFacing implements BlockAction.ActionValue {

    UP(1),
    DOWN(0),
    NORTH(4),
    SOUTH(2),
    EAST(5),
    WEST(3);

    private final int id;

    PistonFacing(final int id) {
        this.id = id;
    }


    @Override
    public int getID() {
        return id;
    }
}
