package com.ait.toolkit.famous.client.events;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class EventData extends JsObject {

	public EventData() {
		jsObj = JsoHelper.createObject();
	}

	protected EventData(JavaScriptObject peer) {
		jsObj = peer;
	}
}
