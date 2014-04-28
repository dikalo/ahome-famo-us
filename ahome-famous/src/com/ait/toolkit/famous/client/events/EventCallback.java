package com.ait.toolkit.famous.client.events;

/**
 * Handler interface for event handling.
 */
public interface EventCallback {
	public void onEvent(String eventType, EventData data);
}
