package me.traffic.assetmanager;

import net.fabricmc.api.ModInitializer;

public class App implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		System.out.println("This is a test message from the assetmanager mod");
	}
}
