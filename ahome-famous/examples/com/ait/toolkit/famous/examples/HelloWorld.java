package com.ait.toolkit.famous.examples;

import com.ait.toolkit.famous.client.core.Context;
import com.ait.toolkit.famous.client.core.Engine;
import com.ait.toolkit.famous.client.core.Surface;
import com.google.gwt.core.client.EntryPoint;

public class HelloWorld implements EntryPoint {

	@Override
	public void onModuleLoad() {

		Context mainContext = Engine.createContext();

		Surface surface = new Surface();
		surface.setSize(200, 200);
		surface.setContent("Hello world");

		mainContext.add(surface);

	}

}
