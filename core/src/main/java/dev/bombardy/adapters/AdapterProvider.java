package dev.bombardy.adapters;

import dev.bombardy.adapters.unsupported.UnsupportedAdapter;
import org.bukkit.Bukkit;

public final class AdapterProvider {

    public static Adapter getAdapter() {
        try {
            return (Adapter) Class.forName(getAdapterClassName()).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (final Exception ignored) {
            // ignored
        }

        return new UnsupportedAdapter();
    }

    private static String getAdapterClassName() {
        final String nmsVersion = getNMSVersion();
        return "dev.bombardy.adapters." + nmsVersion + ".Adapter_" + nmsVersion;
    }

    private static String getNMSVersion() {
        final String name = Bukkit.getServer().getClass().getPackage().getName();
        return name.substring(name.lastIndexOf(46) + 1).replace("v", "");
    }
}
