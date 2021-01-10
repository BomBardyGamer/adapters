package dev.bombardy.adapters.block;

public interface BlockAction<T extends BlockAction.ActionID, U extends BlockAction.ActionValue> {

    T getActionID();

    U getActionValue();

    interface ActionID {

        int getID();
    }

    interface ActionValue {

        int getID();
    }
}
