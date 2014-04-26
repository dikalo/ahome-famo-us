package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

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
		JsoHelper.setAttribute(config, "size", values);
	}

	public void setProperties(Properties value) {
		JsoHelper.setAttribute(config, "properties", value.getJsObj());
	}

}
