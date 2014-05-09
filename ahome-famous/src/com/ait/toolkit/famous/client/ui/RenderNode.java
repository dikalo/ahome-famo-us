/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.famous.client.ui;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.famous.client.core.Properties;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;

/**
 * Base class of all FamoUs nodes that get drawn to the screen.
 */
public abstract class RenderNode extends FamoUsNode {

	public RenderNode() {
		jsObj = JsoHelper.createObject();
	}

	public RenderNode(JavaScriptObject peer) {
		jsObj = peer;
	}

	public void setSize(int width, int height) {
		JsArrayNumber values = JsArrayNumber.createArray().cast();
		values.push(width);
		values.push(height);
		_setSize(values);
	}

	private native void _setSize(JavaScriptObject values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setSize(values);
	}-*/;

	public native void setProperties(Properties value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProperties(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public void setClasses(String... values) {
		JsArrayString cls = JsArrayString.createArray().cast();
		for (String s : values) {
			cls.push(s);
		}
		setClasses(cls);
	}

	public native void setClasses(JsArrayString values)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setClasses(values);
	}-*/;

}
