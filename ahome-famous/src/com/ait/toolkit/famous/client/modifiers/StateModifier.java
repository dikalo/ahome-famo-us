package com.ait.toolkit.famous.client.modifiers;

import com.ait.toolkit.famous.client.core.FamoAnimation;
import com.ait.toolkit.famous.client.core.Modifier;
import com.ait.toolkit.famous.client.core.Transform;
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

	public native void setTransform(Transform transform, FamoAnimation animation)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTransform(
				transform.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				animation.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	private static native void require()/*-{
		$wnd.aitFamoStateModifier = require('famous/modifiers/StateModifier');
	}-*/;

}
