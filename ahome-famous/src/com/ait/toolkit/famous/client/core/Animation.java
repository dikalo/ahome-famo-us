package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class Animation extends JsObject {

	public Animation() {
		jsObj = JsoHelper.createObject();
	}

	public void setDuration(int value) {
		JsoHelper.setAttribute(jsObj, "duration", value);
	}

	public void setCurve(String value) {
		JsoHelper.setAttribute(jsObj, "curve", value);
	}
}