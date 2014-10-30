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

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Transform extends JsObject {

	static {
		require();
	}

	protected Transform(JavaScriptObject obj) {
		jsObj = obj;
	}

	public static Transform translate(double x, double y) {
		return translate(x, y, 0);
	}

	public static native Transform translate(double x, double y, double offset)/*-{
		var obj = $wnd.aitFamoTransform.translate(x, y, offset);
		return @com.ait.toolkit.famous.client.ui.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public static native Transform rotateX(double value)/*-{
		var obj = $wnd.aitFamoTransform.rotateX(value);
		return @com.ait.toolkit.famous.client.ui.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public static native Transform rotateY(double value)/*-{
		var obj = $wnd.aitFamoTransform.rotateY(value);
		return @com.ait.toolkit.famous.client.ui.Transform::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoTransform = require('famous/core/Transform');
	}-*/;

}
