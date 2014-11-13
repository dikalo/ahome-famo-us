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
package com.ait.toolkit.famous.client.transitions;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class FamoAnimation extends JsObject {

	public FamoAnimation() {
		jsObj = JsoHelper.createObject();
	}

	public void setDuration(int value) {
		JsoHelper.setAttribute(jsObj, "duration", value);
	}

	public void setCurve(String value) {
		JsoHelper.setAttribute(jsObj, "curve", value);
	}

	public void setEasing(Easing value) {
		JsoHelper.setAttribute(jsObj, "easing", value.getJsObj());
	}
}
