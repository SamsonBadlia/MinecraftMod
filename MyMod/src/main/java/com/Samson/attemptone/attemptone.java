package com.Samson.attemptone;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("attemptOne")
public class attemptone {
	
	public attemptone() {
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
