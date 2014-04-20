package com.ait.toolkit.famous.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Context extends FamoUsNode {

	protected Context(JavaScriptObject peer) {
		jsObj = peer;
	}

	@Override
	public JavaScriptObject createPeer() {
		return null;
	}

}
