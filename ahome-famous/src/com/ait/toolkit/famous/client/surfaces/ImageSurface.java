package com.ait.toolkit.famous.client.surfaces;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.famous.client.core.RenderNode;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class ImageSurface extends RenderNode {

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

}
