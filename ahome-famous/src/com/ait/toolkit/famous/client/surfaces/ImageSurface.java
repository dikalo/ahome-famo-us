package com.ait.toolkit.famous.client.surfaces;

import com.ait.toolkit.famous.client.core.Surface;
import com.google.gwt.core.client.JavaScriptObject;

public class ImageSurface extends Surface {

	public ImageSurface() {
		jsObj = createPeer();
	}

	static {
		require();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		return new $wnd.aitFamoImageSurface();
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoImageSurface = require('famous/surfaces/ImageSurface');
	}-*/;

}
