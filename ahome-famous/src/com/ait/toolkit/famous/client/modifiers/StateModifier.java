package com.ait.toolkit.famous.client.modifiers;

import com.ait.toolkit.famous.client.core.Modifier;
import com.google.gwt.core.client.JavaScriptObject;

public class StateModifier extends Modifier {

	static {
		require();
	}

	public StateModifier() {
		jsObj = createPeer();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		return new $wnd.aitFamoStateModifier();
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoStateModifier = require('famous/modifiers/StateModifier');
	}-*/;

}
