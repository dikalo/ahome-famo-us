package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Transform extends JsObject {

	public Transform() {

	}

	public static native JavaScriptObject translate(double x, double y,
			double offset)/*-{
		return $wnd.aitFamoTransform.translate(x, y);
	}-*/;

}
