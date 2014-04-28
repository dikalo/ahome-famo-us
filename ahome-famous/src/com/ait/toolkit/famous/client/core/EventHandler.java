package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.famous.client.events.EventData;
import com.ait.toolkit.famous.client.events.EventHandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

public abstract class EventHandler extends FamoUsNode {

	/**
	 * Trigger an event, sending to all downstream handlers listening for provided 'type' key.
	 * 
	 * @param event
	 *            , event type key (for example, 'click')
	 * @param data
	 *            , event data
	 */
	public native EventHandler emit(String event, EventData data)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.emit(event,
				data.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	/**
	 * Bind a callback function to an event type handled by this object.
	 * 
	 * @param event
	 *            , event type key (for example, 'click')
	 * @param handler
	 *            , callback
	 */
	public native EventHandlerRegistration on(String event, EventHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var fn = function(event, data) {
			var eventData = @com.ait.toolkit.famous.client.events.EventData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
			handler.@com.ait.toolkit.famous.client.events.EventCallback::onEvent(Ljava/lang/String;Lcom/ait/toolkit/famous/client/events/EventData;)(event,eventData);
		};
		peer.on(event, fn);

		return @com.ait.toolkit.famous.client.events.EventHandlerRegistration::new(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(event, fn, peer);
	}-*/;

	/**
	 * Add event handler object to set of downstream handlers.
	 * 
	 * @param target
	 *            , event handler target object
	 * @return passed event handler
	 */
	public native JavaScriptObject pipe(EventHandler target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.pipe(target.@com.ait.toolkit.core.client.JsObject::getJsObj()());

	}-*/;

	/**
	 * Remove handler object from set of downstream handlers. Undoes work of "pipe".
	 * 
	 * @param target
	 *            , event handler target object
	 * @return passed event handler
	 */
	public native JavaScriptObject unpipe(EventHandler target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.unpipe(target.@com.ait.toolkit.core.client.JsObject::getJsObj()());

	}-*/;

}
