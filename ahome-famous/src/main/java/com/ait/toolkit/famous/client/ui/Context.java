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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class Context extends Surface {

	protected Context(JavaScriptObject peer) {
		jsObj = peer;
	}

	/**
	 * Move this Context to another containing document element.
	 * 
	 * @param container
	 *            ,Element to which content will be migrated
	 */
	public native void migrate(Element container)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.migrate(container);
	}-*/;

	/**
	 * Get current perspective of this context in pixels.
	 * 
	 * @return
	 */
	public native double getPerspective()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getPerspective();
	}-*/;

	/**
	 * Set current perspective of this context in pixels.
	 */
	public native void setPerspective(double value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setPerspective(value);
	}-*/;

	@Override
	public JavaScriptObject createPeer() {
		return null;
	}

}
