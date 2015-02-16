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
package com.ait.toolkit.famous.client.events;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * 
 */
public class MouseEvent extends UIEvent {

	protected MouseEvent(JavaScriptObject peer) {
		super(peer);
	}

	public static MouseEvent cast(Event e) {
		return new MouseEvent(e.getJsObj());
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
