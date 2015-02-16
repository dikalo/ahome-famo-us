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

import com.ait.toolkit.famous.client.core.EventHandler;
import com.ait.toolkit.famous.client.core.Size;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Base class of all Famo.us nodes
 */
public abstract class FamoUsNode extends EventHandler {

	public FamoUsNode() {

	}

	public FamoUsNode(JavaScriptObject peer) {
		jsObj = peer;
	}

	public static FamoUsNode instance(JavaScriptObject peer) {
		return new FamoUsNode(peer) {
			@Override
			public JavaScriptObject createPeer() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	/**
	 * 
	 */
	public native Size getSize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var s = peer.getSize();
		var o = new $wnd.Object();
		o.width = s[1];
		o.height = s[2];
		return @com.ait.toolkit.famous.client.core.Size::from(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native FamoUsNode add(FamoUsNode child)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var childPeer = child.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.add(childPeer);
		return @com.ait.toolkit.famous.client.ui.FamoUsNode::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public native FamoUsNode add(Modifier child)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var childPeer = child.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var toReturn = peer.add(childPeer);
		return @com.ait.toolkit.famous.client.ui.FamoUsNode::instance(Lcom/google/gwt/core/client/JavaScriptObject;)(toReturn);
	}-*/;

	public abstract JavaScriptObject createPeer();

}
