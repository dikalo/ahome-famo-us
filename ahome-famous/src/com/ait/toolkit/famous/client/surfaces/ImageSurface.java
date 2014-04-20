package com.ait.toolkit.famous.client.surfaces;

import com.ait.toolkit.famous.client.core.Displayable;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class ImageSurface extends JsObject implements Displayable {

	public ImageSurface() {
		jsObj = JsoHelper.createObject();
	}

	private native JavaScriptObject createPeer()/*-{
		var config = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return new $wnd.aitFomImageSurface(config);
	}-*/;

	public void setSize(int width, int height) {
		JsArrayNumber values = JsArrayNumber.createArray().cast();
		values.push(width);
		values.push(height);
		JsoHelper.setAttribute(jsObj, "size", values);
	}

	public void setContent(String content) {
		JsoHelper.setAttribute(jsObj, "content", content);
	}

	@Override
	public JavaScriptObject getDisplayObject() {
		return createPeer();
	}

}
