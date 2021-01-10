package dev.bombardy.adapters.unsupported;

import dev.bombardy.adapters.Adapter;
import dev.bombardy.adapters.Capabilities;
import dev.bombardy.adapters.login.LoginAdapter;

import java.util.EnumSet;
import java.util.Set;

public final class UnsupportedAdapter implements Adapter {

    @Override
    public Set<Capabilities> getCapabilities() {
        return EnumSet.noneOf(Capabilities.class);
    }

    @Override
    public boolean hasCapability(Capabilities capability) {
        return false;
    }

    @Override
    public LoginAdapter getLoginAdapter() {
        throw new UnsupportedOperationException();
    }
}
