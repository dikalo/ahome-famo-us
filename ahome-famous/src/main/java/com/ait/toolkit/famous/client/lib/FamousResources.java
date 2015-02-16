package com.ait.toolkit.famous.client.lib;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface FamousResources extends ClientBundle {

	public static final FamousResources INSTANCE = GWT.create(FamousResources.class);

	@Source("lib.css")
	TextResource css();

	@Source("shim.js")
	TextResource shim();

	@Source("lib.js")
	TextResource lib();
}
