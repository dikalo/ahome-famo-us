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
