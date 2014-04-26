package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class Surface extends RenderNode {

	public Surface() {
		config = JsoHelper.createObject();
	}

	static {
		require();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		var config = this.@com.ait.toolkit.famous.client.core.FamoUsNode::getConfig()();
		var toReturn = new $wnd.aitFamoSurface(config);
		this.@com.ait.toolkit.core.client.JsObject::jsObj = toReturn;
		return toReturn;
	}-*/;

	public void setContent(String content) {
		JsoHelper.setAttribute(config, "content", content);
	}

	private static native void require()/*-{
		$wnd.aitFamoSurface = require('famous/core/Surface');
	}-*/;

}
