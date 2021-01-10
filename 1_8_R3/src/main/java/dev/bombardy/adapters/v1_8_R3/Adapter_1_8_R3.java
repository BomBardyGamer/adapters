package dev.bombardy.adapters.v1_8_R3;

import dev.bombardy.adapters.Adapter;
import dev.bombardy.adapters.Capabilities;
import dev.bombardy.adapters.login.LoginAdapter;
import dev.bombardy.adapters.v1_8_R3.login.LoginAdapter_1_8_R3;

import java.util.EnumSet;
import java.util.Set;

public final class Adapter_1_8_R3 implements Adapter {

    @Override
    public Set<Capabilities> getCapabilities() {
        return EnumSet.noneOf(Capabilities.class);
    }

    @Override
    public LoginAdapter getLoginAdapter() {
        return new LoginAdapter_1_8_R3();
    }
}
