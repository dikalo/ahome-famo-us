package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.Util;
import com.ait.toolkit.famous.client.lib.FamousResources;

public final class Famous {

	private Famous() {

	}

	public static void load() {
		Util.injectStyle(FamousResources.INSTANCE.css());
		Util.injectJs(FamousResources.INSTANCE.shim());
		Util.injectJs(FamousResources.INSTANCE.lib());
	}

}
