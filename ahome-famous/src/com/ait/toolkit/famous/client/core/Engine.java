package com.ait.toolkit.famous.client.core;

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

	private static native void require()/*-{
		$wnd.aitFamoEngine = require('famous/core/Engine');
	}-*/;

}
