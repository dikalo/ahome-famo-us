package com.ait.toolkit.famous.client.core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;

public class Context extends EventHandler {

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
	 * Gets viewport size for Context.
	 */
	public native Size getSize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var s = peer.getSize();
		var o = new $wnd.Object();
		o.width = s[1];
		o.height = s[2];
		return @com.ait.toolkit.famous.client.core.Size::from(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	/**
	 * Sets viewport size for Contex
	 */
	public void setSize(Size size) {
		JsArrayNumber values = JsArrayNumber.createArray().cast();
		values.push(size.getWidth());
		values.push(size.getHeight());
		setSize(values);
	}

	/**
	 * Sets viewport size for Contex
	 */
	public native void setSize(JsArrayNumber values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSize(values);
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

	// TODO setPerpective

	@Override
	public JavaScriptObject createPeer() {
		return null;
	}

}
