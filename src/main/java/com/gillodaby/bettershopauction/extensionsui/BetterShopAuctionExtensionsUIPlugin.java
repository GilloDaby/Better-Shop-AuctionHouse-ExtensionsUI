package com.gillodaby.bettershopauction.extensionsui;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

/**
 * Asset-only companion plugin for {@code BetterShopAuction}.
 *
 * <p>Ships overriding {@code .ui} files (every page that touches a
 * background patch or button texture) plus the modern texture set
 * under {@code Common/UI/Custom/Textures/ModernShop/Patches/}. When
 * this plugin is installed alongside the main {@code BetterShopAuction}
 * plugin, the engine resolves the duplicated resource paths in favour
 * of this plugin's copies — every container patch, panel patch,
 * button state and section separator switches to the modern flat dark
 * navy + cyan accent theme.</p>
 *
 * <p>Removing this plugin makes the main plugin fall back to the
 * vanilla Hytale game-asset look automatically. Nothing here is
 * required for the main plugin's logic — it's pure visual override.</p>
 */
public final class BetterShopAuctionExtensionsUIPlugin extends JavaPlugin {

    public BetterShopAuctionExtensionsUIPlugin(JavaPluginInit init) {
        super(init);
        // Resources (textures + .ui overrides) are loaded automatically
        // from the jar's `Common/UI/Custom/` tree by the engine. There
        // is no runtime registration to perform.
    }
}
