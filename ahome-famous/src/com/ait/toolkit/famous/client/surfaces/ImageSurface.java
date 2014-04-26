package com.ait.toolkit.famous.client.surfaces;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.famous.client.core.Surface;
import com.google.gwt.core.client.JavaScriptObject;

public class ImageSurface extends Surface {

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

	private static native void require()/*-{
		$wnd.aitFamoImageSurface = require('famous/surfaces/ImageSurface');
	}-*/;

}
