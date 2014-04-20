package com.ait.toolkit.famous.client.modifiers;

import com.ait.toolkit.famous.client.core.AnimationConfig;
import com.ait.toolkit.famous.client.core.Modifier;
import com.google.gwt.core.client.JavaScriptObject;

public class StateModifier extends Modifier {

	public StateModifier() {
		jsObj = createPeer();
	}

	private native JavaScriptObject createPeer()/*-{
		return new $wnd.aitFamoStateModifier();
	}-*/;

	public native void setTransform(JavaScriptObject o,
			AnimationConfig animation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTransform(o,
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

}
