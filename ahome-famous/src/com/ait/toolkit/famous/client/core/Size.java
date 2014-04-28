package com.ait.toolkit.famous.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class Size extends JsObject {

	public Size() {
		jsObj = JsoHelper.createObject();
	}

	public Size(double widht, double height) {
		this();
		this.setWidth(widht);
		this.setHeight(height);
	}

	protected Size(JavaScriptObject peer) {
		jsObj = peer;
	}

	public void setHeight(double value) {
		JsoHelper.setAttribute(jsObj, "height", value);
	}

	public double getHeight() {
		return JsoHelper.getAttributeAsDouble(jsObj, "height");
	}

	public void setX(String value) {
		JsoHelper.setAttribute(jsObj, "x", value);
	}

	public void setWidth(double value) {
		JsoHelper.setAttribute(jsObj, "width", value);
	}

	public double getWidth() {
		return JsoHelper.getAttributeAsDouble(jsObj, "width");
	}

	public static Size from(JavaScriptObject peer) {
		return new Size(peer);
	}

}
