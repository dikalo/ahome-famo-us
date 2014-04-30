package com.ait.toolkit.famous.client.events;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 *
 */
public class UIEvent extends Event {

	protected UIEvent(JavaScriptObject peer) {
		super(peer);
	}

	public boolean isBubbles() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "bubbles");
	}

	public boolean isCancelBubble() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "cancelBubble");
	}

	public JavaScriptObject getClipboardData() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "clipboardData");
	}

	public boolean isCancelable() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "cancelable");
	}

	public int getCharCode() {
		return JsoHelper.getAttributeAsInt(jsObj, "charcode");
	}

	public JavaScriptObject getCurrentTarget() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "currentTarget");
	}

	public boolean isDefaultPrevented() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "defaultPrevented");
	}

	public int getDetail() {
		return JsoHelper.getAttributeAsInt(jsObj, "detail");
	}

	public int getEventPhase() {
		return JsoHelper.getAttributeAsInt(jsObj, "eventPhase");
	}

	public String getIdentifier() {
		return JsoHelper.getAttribute(jsObj, "eventPhase");
	}

	public String getType() {
		return JsoHelper.getAttribute(jsObj, "type");
	}

	public double getTimeStamp() {
		return JsoHelper.getAttributeAsDouble(jsObj, "timeStamp");
	}

	public Element getSrcElement() {
		return JsoHelper.getAttributeAsElement(jsObj, "srcElement");
	}

	public Element getTarget() {
		return JsoHelper.getAttributeAsElement(jsObj, "target");
	}

	public int getWitch() {
		return JsoHelper.getAttributeAsInt(jsObj, "witch");
	}

	public JavaScriptObject getView() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "view");
	}

	public int getPageX() {
		return JsoHelper.getAttributeAsInt(jsObj, "pageX");
	}

	public int getPageY() {
		return JsoHelper.getAttributeAsInt(jsObj, "pageY");
	}

	public int getKeyCode() {
		return JsoHelper.getAttributeAsInt(jsObj, "keyCode");
	}

	public double getLayerY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "layerY");
	}

}
