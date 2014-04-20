package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

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
}
