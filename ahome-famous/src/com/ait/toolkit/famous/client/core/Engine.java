package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.famous.client.events.EventData;
import com.ait.toolkit.famous.client.events.EventHandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * The singleton object initiated upon process startup which manages all active Context instances, runs the render dispatch loop, and acts as a listener and dispatcher for events.
 * All methods are therefore static. On static initialization, window.requestAnimationFrame is called with the event loop function. Note: Any window in which Engine runs will
 * prevent default scrolling behavior on the 'touchmove' event.
 */
public class Engine {

	static {
		require();
	}

	private Engine() {

	}

	/**
	 * Registers an existing context to be updated within the run loop.
	 * 
	 * @return, provided context
	 */
	public static native Context registerContect(Context context)/*-{
		var obj = $wnd.aitFamoEngine
				.createContext(context.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.famous.client.core.Context::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Creates a new Context for rendering and event handling with provided document element as top of each tree. This will be tracked by the process-wide Engine.
	 * 
	 * @return, new Context
	 */
	public static native Context createContext()/*-{
		var context = $wnd.aitFamoEngine.createContext();
		return @com.ait.toolkit.famous.client.core.Context::new(Lcom/google/gwt/core/client/JavaScriptObject;)(context);
	}-*/;

	/**
	 * Creates a new Context for rendering and event handling with provided document element as top of each tree. This will be tracked by the process-wide Engine.
	 * 
	 * @param el
	 *            , top of Famo.us document element tree
	 * @return, new Context within el
	 */
	public static native Context createContext(Element el)/*-{
		var context = $wnd.aitFamoEngine.createContext(el);
		return @com.ait.toolkit.famous.client.core.Context::new(Lcom/google/gwt/core/client/JavaScriptObject;)(context);
	}-*/;

	/**
	 * Creates a new Context for rendering and event handling with provided document element as top of each tree. This will be tracked by the process-wide Engine.
	 * 
	 * @param el
	 *            , top of Famo.us document element tree
	 * @return, new Context within el
	 */
	public static Context createContext(Widget el) {
		return createContext(el.getElement());
	}

	/**
	 * Trigger an event, sending to all downstream handlers listening for provided 'type' key.
	 * 
	 * @param event
	 *            , event type key (for example, 'click')
	 * @param data
	 *            , event data
	 */
	public static native Engine emit(String event, EventData data)/*-{
		$wnd.aitFamoEngine.emit(event,
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
	public static native EventHandlerRegistration on(String event, EventHandler handler)/*-{
		var fn = function(event, data) {
			var eventData = @com.ait.toolkit.famous.client.events.EventData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(data);
			handler.@com.ait.toolkit.famous.client.events.EventCallback::onEvent(Ljava/lang/String;Lcom/ait/toolkit/famous/client/events/EventData;)(event,eventData);
		};
		$wnd.aitFamoEngine.on(event, fn);

		return @com.ait.toolkit.famous.client.events.EventHandlerRegistration::new(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(event, fn, $wnd.aitFamoEngine);
	}-*/;

	/**
	 * Add event handler object to set of downstream handlers.
	 * 
	 * @param target
	 *            , event handler target object
	 * @return passed event handler
	 */
	public static native JavaScriptObject pipe(EventHandler target)/*-{
		return $wnd.aitFamoEngine.pipe(event,
				target.@com.ait.toolkit.core.client.JsObject::getJsObj()());

	}-*/;

	/**
	 * Remove handler object from set of downstream handlers. Undoes work of "pipe".
	 * 
	 * @param target
	 *            , event handler target object
	 * @return passed event handler
	 */
	public static native JavaScriptObject unpipe(EventHandler target)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return $wnd.aitFamoEngine
				.unpipe(target.@com.ait.toolkit.core.client.JsObject::getJsObj()());

	}-*/;

	/**
	 * Return the current calculated frames per second of the Engine.
	 */
	public static native double getFPS()/*-{
		return $wnd.aitFamoEngine.getFPS();
	}-*/;

	/**
	 * 
	 * Queue a function to be executed on the next tick of the Engine.
	 */
	public static native void nextTick(NextTickHandler fn)/*-{
		$wnd.aitFamoEngine
				.nextTick(function(w) {
					fn.@com.ait.toolkit.famous.client.core.NextTickHandler::onNextTick(Lcom/google/gwt/core/client/JavaScriptObject;)(w);
				});
	}-*/;

	/**
	 * 
	 * Queue a function to be executed sometime soon, at a time that is unlikely to affect frame rate.
	 */
	public static native void defer(Function fn)/*-{
		$wnd.aitFamoEngine.defer(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * Set the maximum fps at which the system should run. If internal render loop is called at a greater frequency than this FPSCap, Engine will throttle render and update until
	 * this rate is achieved.
	 */
	public static native void setFPSCap(double value)/*-{
		$wnd.aitFamoEngine.setFPSCap(value);
	}-*/;

	/**
	 * Set engine options
	 */
	public static native void setOptions(EngineOptions options)/*-{
		$wnd.aitFamoEngine
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Get engine options
	 */
	public static native EngineOptions getOptions(String key)/*-{
		var obj = $wnd.aitFamoEngine.getOptions(key);
		if (obj != null) {
			return @com.ait.toolkit.famous.client.core.EngineOptions::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
		}
		return null;
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoEngine = require('famous/core/Engine');
	}-*/;

}
