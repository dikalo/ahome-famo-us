package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Transform extends JsObject {

	protected Transform(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static Transform translate(double x, double y) {
		return translate(x, y, 0);
	}

	public static native Transform translate(double x, double y, double offset)/*-{
		var obj = $wnd.aitFamoTransform.translate(x, y, offset);
		return @com.ait.toolkit.famous.client.core.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

}
