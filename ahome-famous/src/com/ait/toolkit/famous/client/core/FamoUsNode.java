package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class of all Famo.us nodes
 */
public abstract class FamoUsNode extends JsObject {

	public FamoUsNode() {
		jsObj = JsoHelper.createObject();
	}

	public FamoUsNode(JavaScriptObject peer) {
		jsObj = peer;
	}

	public static FamoUsNode instance(JavaScriptObject peer) {
		return new FamoUsNode(peer) {
		};
	}

	public native FamoUsNode add(FamoUsNode child)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var childPeer = child.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.add(childPeer);
		return @com.ait.toolkit.famous.client.core.FamoUsNode::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

}
