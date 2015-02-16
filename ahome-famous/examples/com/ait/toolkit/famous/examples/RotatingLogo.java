package com.ait.toolkit.famous.examples;

import com.ait.toolkit.famous.client.core.Engine;
import com.ait.toolkit.famous.client.ui.ImageSurface;
import com.ait.toolkit.famous.client.ui.Modifier;
import com.ait.toolkit.famous.client.ui.Transform;
import com.ait.toolkit.famous.client.ui.TransformFunction;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.user.client.ui.RootPanel;

public class RotatingLogo implements EntryPoint {

	@Override
	public void onModuleLoad() {

		RootPanel.getBodyElement().getStyle().setBackgroundColor("black");

		ImageSurface logo = new ImageSurface();
		logo.setSize(250, 250);
		logo.setContent(GWT.getHostPageBaseURL() + "ahome_logo.png");
		logo.setClasses("double-sided");

		final double time = JsDate.create().getTime();

		Modifier centerSpinModifier = new Modifier();
		centerSpinModifier.setOrigin(0.5, 0.5);
		centerSpinModifier.setTransform(new TransformFunction() {
			@Override
			public Transform createTransform() {
				return Transform.rotateY(.002 * (JsDate.create().getTime() - time));
			}
		});

		Engine.createContext().add(centerSpinModifier).add(logo);

	}

}
