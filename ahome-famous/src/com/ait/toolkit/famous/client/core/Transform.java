package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Transform extends JsObject {

	protected Transform(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static native Transform translate(double x, double y, double offset)/*-{
		var obj = $wnd.aitFamoTransform.translate(x, y);
		return @com.ait.toolkit.famous.client.core.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

}
