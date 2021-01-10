package dev.bombardy.adapters.packets;

public final class CustomPayload {

    private final String payload;

    public CustomPayload(final String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }
}
