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
package com.ait.toolkit.famous.client.events;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Registration class for offline event handlers. This class is returned when adding an event handler to the {@link Offline}.
 */
public class EventHandlerRegistration {

	private final String eventName;
	private final JavaScriptObject callback;
	private final JavaScriptObject eventHandler;

	public EventHandlerRegistration(String eventName, JavaScriptObject callback, JavaScriptObject eventHandler) {
		this.eventName = eventName;
		this.callback = callback;
		this.eventHandler = eventHandler;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @return the callback
	 */
	public JavaScriptObject getCallback() {
		return callback;
	}

	/**
	 * @return the event handler
	 */
	public JavaScriptObject getHandler() {
		return eventHandler;
	}

	/**
	 * Unbind an event by type and handler. This undoes the work of "on".
	 */
	public native void unregister()/*-{
		var event = this.@com.ait.toolkit.famous.client.events.EventHandlerRegistration::getEventName()();
		var fn = this.@com.ait.toolkit.famous.client.events.EventHandlerRegistration::getCallback()();
		var handler = this.@com.ait.toolkit.famous.client.events.EventHandlerRegistration::getHandler()();
		handler.removeListener(event, fn);
	}-*/;

}
