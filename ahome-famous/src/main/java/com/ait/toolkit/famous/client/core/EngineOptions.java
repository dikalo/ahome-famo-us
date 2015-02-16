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

/**
 * Options for the Famo engine-
 */
public class EngineOptions extends JsObject {

	public EngineOptions() {
		jsObj = JsoHelper.createObject();
	}

	protected EngineOptions(JavaScriptObject peer) {
		jsObj = peer;
	}

	/**
	 * maximum fps at which the system should run
	 * 
	 * @param value
	 */
	public void setFpsCap(double value) {
		JsoHelper.setAttribute(jsObj, "fpsCap", value);
	}

	public double getFpsCap() {
		return JsoHelper.getAttributeAsDouble(jsObj, "fpsCap");
	}

	/**
	 * whether the run loop should continue
	 * 
	 * @param value
	 */
	public void setRunLoop(boolean value) {
		JsoHelper.setAttribute(jsObj, "runLoop", value);
	}

	public boolean runLoop() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "runLoop");
	}

	/**
	 * type of container element. Defaults to 'div'.
	 * 
	 * @param value
	 */
	public void setContainerType(String value) {
		JsoHelper.setAttribute(jsObj, "containerType", value);
	}

	public String getContainerType() {
		return JsoHelper.getAttribute(jsObj, "containerType");
	}

	/**
	 * class of container element. Defaults to 'famous-container.
	 * 
	 * @param value
	 */
	public void setContainerClass(String value) {
		JsoHelper.setAttribute(jsObj, "containerClass", value);
	}

	public String getContainerClass() {
		return JsoHelper.getAttribute(jsObj, "containerClass");
	}

}
