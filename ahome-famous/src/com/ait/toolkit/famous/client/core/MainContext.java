package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.famous.client.modifiers.StateModifier;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class MainContext {

	public static void add(Displayable object) {
		add(object.getDisplayObject());
	}

	public static void add(Element el, Displayable object) {
		add(el, object.getDisplayObject());
	}

	public static void add(StateModifier state, Element el, Displayable object) {
		add(state.getJsObj(), el, object.getDisplayObject());
	}

	private static native void add(JavaScriptObject o) /*-{
		$wnd.aitFamoEngine.createContext().add(o);
	}-*/;

	private static native void add(JavaScriptObject target, JavaScriptObject o) /*-{
		$wnd.aitFamoEngine.createContext(target).add(o);
	}-*/;

	private static native void add(JavaScriptObject p, JavaScriptObject target,
			JavaScriptObject o) /*-{
		$wnd.aitFamoEngine.createContext(target).add(p).add(o);
	}-*/;

}
