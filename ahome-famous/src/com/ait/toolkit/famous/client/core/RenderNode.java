package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * Base class of all FamoUs nodes that get drawn to the screen.
 */
public abstract class RenderNode extends FamoUsNode {

	public RenderNode() {
		jsObj = JsoHelper.createObject();
	}

	public RenderNode(JavaScriptObject peer) {
		jsObj = peer;
	}

	public void setSize(int width, int height) {
		JsArrayNumber values = JsArrayNumber.createArray().cast();
		values.push(width);
		values.push(height);
		_setSize(values);
	}

	private native void _setSize(JavaScriptObject values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSize(values);
	}-*/;

	public native void setProperties(Properties value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProperties(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public void setClasses(String... values) {
		JsArrayString cls = JsArrayString.createArray().cast();
		for (String s : values) {
			cls.push(s);
		}
		setClasses(cls);
	}

	public native void setClasses(JsArrayString values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setClasses(values);
	}-*/;

}
