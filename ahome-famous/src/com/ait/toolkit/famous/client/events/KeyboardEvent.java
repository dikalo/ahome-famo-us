package com.ait.toolkit.famous.client.events;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 */
public class KeyboardEvent extends UIEvent {

	protected KeyboardEvent(JavaScriptObject peer) {
		super(peer);
	}

	public boolean isAltGraphKey() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "altGraphkey");
	}

	public boolean isAltKey() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "altkey");
	}

	public boolean isACtrlKey() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "ctrlkey");
	}

	public int getKeyLocation() {
		return JsoHelper.getAttributeAsInt(jsObj, "keyLocation");
	}

	public double getLayerX() {
		return JsoHelper.getAttributeAsDouble(jsObj, "layerX");
	}

	public int getLocation() {
		return JsoHelper.getAttributeAsInt(jsObj, "location");
	}

	public boolean isMetaKey() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "metaKey");
	}

	public boolean isRepeat() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "repeat");
	}

	public static KeyboardEvent cast(Event e) {
		return new KeyboardEvent(e.getJsObj());
	}

}
