/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2018 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.aws;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

@Kroll.module(name="TitaniumAmazonAws", id="ti.aws")
public class TitaniumAmazonAwsModule extends KrollModule
{
	// Standard Debugging variables
	private static final String LCAT = "TitaniumAmazonAwsModule";
	private static final boolean DBG = TiConfig.LOGD;

	@Kroll.method
	@Kroll.setProperty
	public void setDefaultConfiguration(KrollDict config) {
		int region = config.getInt("region");
		String poolId = config.getString("poolId");

		if (poolId == null) {
			Log.e(LCAT, "Missing required parameters 'region' and/or 'poolId'!");
			return;
		}

		// TODO: Make credentials provider shared
	}
}

