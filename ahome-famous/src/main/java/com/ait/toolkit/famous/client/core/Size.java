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
