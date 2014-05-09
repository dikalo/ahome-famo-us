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

public class StateModifier extends Modifier {

	static {
		require();
	}

	public StateModifier() {
		jsObj = createPeer();
	}

	@Override
	public native JavaScriptObject createPeer()/*-{
		return new $wnd.aitFamoStateModifier();
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoStateModifier = require('famous/modifiers/StateModifier');
	}-*/;

}
