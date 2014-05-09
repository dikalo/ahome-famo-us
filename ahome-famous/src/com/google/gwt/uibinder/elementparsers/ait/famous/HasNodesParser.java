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
package com.google.gwt.uibinder.elementparsers.ait.famous;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.rebind.FieldWriter;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

/**
 * Parses any Element that implement {@link com.ait.toolkit.famous.client.ui.HasNodes;}.
 * 
 * This handles all nodes that support a single-argument add() method.
 */
public class HasNodesParser implements ElementParser {

	public void parse(XMLElement elem, String fieldName, JClassType type, UiBinderWriter writer) throws UnableToCompleteException {
		// Parse children.
		for (XMLElement child : elem.consumeChildElements()) {
			if (!writer.isFamousNode(child)) {
				writer.die(child, "Expecting only FamousNode in %s", elem);
			}
			FieldWriter childField = writer.parseElementToField(child);
			writer.addStatement("%1$s.add(%2$s);", fieldName, childField.getNextReference());
		}
	}
}