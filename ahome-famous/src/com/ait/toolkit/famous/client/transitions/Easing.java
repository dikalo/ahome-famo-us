package com.ait.toolkit.famous.client.transitions;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Easing extends JsObject {

	protected Easing(JavaScriptObject peer) {
		jsObj = peer;
	}

	public static Easing get(String fn) {
		return new Easing(_get(fn));
	}

	private static native JavaScriptObject _get(String easing)/*-{
		return $wnd.famous.transitions.Easing[easing];
	}-*/;

}
