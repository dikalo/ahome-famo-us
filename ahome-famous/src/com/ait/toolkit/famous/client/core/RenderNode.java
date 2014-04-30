package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * Base class of all FamoUs nodes that get drawn to the screen.
 */
public abstract class RenderNode extends EventHandler {

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
		JsoHelper.setAttribute(config, "size", values);
	}

	public void setProperties(Properties value) {
		JsoHelper.setAttribute(config, "properties", value.getJsObj());
	}

	public void setClasses(String... values) {
		JsArrayString cls = JsArrayString.createArray().cast();
		for (String s : values) {
			cls.push(s);
		}
		setClasses(cls);
	}

	public void setClasses(JsArrayString value) {
		JsoHelper.setAttribute(config, "classes", value);
	}

}
