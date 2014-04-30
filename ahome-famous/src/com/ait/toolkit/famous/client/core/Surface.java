package com.ait.toolkit.famous.client.core;

import com.google.gwt.core.client.JavaScriptObject;

public class Surface extends RenderNode {

	public Surface() {
		jsObj = createPeer();
	}

	static {
		require();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		return new $wnd.aitFamoSurface();
	}-*/;

	public native void setContent(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setContent(value);
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoSurface = require('famous/core/Surface');
	}-*/;

}
