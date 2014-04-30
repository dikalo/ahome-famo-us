package com.ait.toolkit.famous.client.events;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * 
 */
public class TouchEvent extends UIEvent {

	protected TouchEvent(JavaScriptObject peer) {
		super(peer);
	}

	public static TouchEvent cast(Event e) {
		return new TouchEvent(e.getJsObj());
	}

	public Element getFromElement() {
		return JsoHelper.getAttributeAsElement(jsObj, "fromElement");
	}

	public int getOffsetX() {
		return JsoHelper.getAttributeAsInt(jsObj, "offsetX");
	}

	public int getOffsetY() {
		return JsoHelper.getAttributeAsInt(jsObj, "offsetY");
	}

	public int getScreenX() {
		return JsoHelper.getAttributeAsInt(jsObj, "screenX");
	}

	public int getScreenY() {
		return JsoHelper.getAttributeAsInt(jsObj, "screenY");
	}

}
