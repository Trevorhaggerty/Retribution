package com.daikonenvironments.thaggerty.retribution.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.daikonenvironments.thaggerty.retribution.Retribution;

import retributionTools.retributionInfo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = retributionInfo.WIDTH;
		config.height = retributionInfo.HEIGHT;
		
		
		new LwjglApplication(new Retribution(), config);
	}
}
