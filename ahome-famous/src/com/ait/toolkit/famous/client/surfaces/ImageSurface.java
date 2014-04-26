package com.ait.toolkit.famous.client.surfaces;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.famous.client.core.RenderNode;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class ImageSurface extends RenderNode {

	public ImageSurface() {
		config = JsoHelper.createObject();
	}

	static {
		require();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		var config = this.@com.ait.toolkit.famous.client.core.FamoUsNode::getConfig()();
		var toReturn = new $wnd.aitFamoImageSurface(config);
		this.@com.ait.toolkit.core.client.JsObject::jsObj = toReturn;
		return toReturn;
	}-*/;

	public void setSize(int width, int height) {
		JsArrayNumber values = JsArrayNumber.createArray().cast();
		values.push(width);
		values.push(height);
		JsoHelper.setAttribute(config, "size", values);
	}

	public void setContent(String content) {
		JsoHelper.setAttribute(config, "content", content);
	}

	private static native void require()/*-{
		$wnd.aitFamoImageSurface = require('famous/surfaces/ImageSurface');
	}-*/;

}
