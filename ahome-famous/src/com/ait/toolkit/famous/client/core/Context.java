package com.ait.toolkit.famous.client.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Context extends Surface {

	protected Context(JavaScriptObject peer) {
		jsObj = peer;
	}

	/**
	 * Move this Context to another containing document element.
	 * 
	 * @param container
	 *            ,Element to which content will be migrated
	 */
	public native void migrate(Element container)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.migrate(container);
	}-*/;

	/**
	 * Get current perspective of this context in pixels.
	 * 
	 * @return
	 */
	public native double getPerspective()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPerspective();
	}-*/;

	/**
	 * Set current perspective of this context in pixels.
	 */
	public native void setPerspective(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPerspective(value);
	}-*/;

	@Override
	public JavaScriptObject createPeer() {
		return null;
	}

}
