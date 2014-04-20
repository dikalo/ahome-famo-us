package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class of Famo.us nodes that are capable of modifying the nodes below it
 * in the Render Tree.
 */
public abstract class Modifier extends FamoUsNode {

	public Modifier() {
		jsObj = JsoHelper.createObject();
	}

	public Modifier(JavaScriptObject peer) {
		jsObj = peer;
	}

}
