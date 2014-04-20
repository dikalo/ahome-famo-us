package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class of all Famo.us nodes
 */
public abstract class FamoUsNode extends JsObject {

	protected JavaScriptObject config;

	public FamoUsNode() {
		config = JsoHelper.createObject();
	}

	public FamoUsNode(JavaScriptObject peer) {
		jsObj = peer;
	}

	public static FamoUsNode instance(JavaScriptObject peer) {
		return new FamoUsNode(peer) {
			@Override
			public JavaScriptObject createPeer() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	public native FamoUsNode add(FamoUsNode child)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var childPeer = child.@com.ait.toolkit.famous.client.core.FamoUsNode::createPeer()();
		var toReturn = peer.add(childPeer);
		return @com.ait.toolkit.famous.client.core.FamoUsNode::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public native FamoUsNode add(Modifier child)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var childPeer = child.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.add(childPeer);
		return @com.ait.toolkit.famous.client.core.FamoUsNode::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public abstract JavaScriptObject createPeer();

	public JavaScriptObject getConfig() {
		Util.cleanObjectId(config);
		return config;
	}

}
