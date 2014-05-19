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
package com.ait.toolkit.famous.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.core.linker.CrossSiteIframeLinker;

/**
 * Linker for the Famo.us library. Makes Famo.us play well with GWT
 */
@LinkerOrder(LinkerOrder.Order.PRIMARY)
public class FamoUsLinker extends CrossSiteIframeLinker {

	// private final String APP_COMPILATION_FILE_NAME =
	// "applicationCompileDateTime.txt";

	@Override
	public String getDescription() {
		return "Famo.us linker";
	}

	@Override
	protected String generatePrimaryFragmentString(TreeLogger logger, LinkerContext context, CompilationResult result, String js, int length, ArtifactSet artifacts)
			throws UnableToCompleteException {
		String toReturn = super.generatePrimaryFragmentString(logger, context, result, js, length, artifacts);

		/*
		 * if (toReturn.indexOf("aitFamo") >= 0) { StringBuilder builder = new StringBuilder();
		 * 
		 * builder.append("define(function(require, exports, module) {\n"); builder.append(toReturn); builder.append("\n});"); toReturn = builder.toString();
		 * logger.log(TreeLogger.WARN, "++++++++++++++++++++++" + toReturn); }
		 */

		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++" + toReturn);
		return toReturn;
	}

	@Override
	protected String generateSelectionScript(TreeLogger logger, LinkerContext context, ArtifactSet artifacts, CompilationResult result) throws UnableToCompleteException {
		// return super
		// .generateSelectionScript(logger, context, artifacts, result);

		return generateFamoStartScript(logger, context, super.generateSelectionScript(logger, context, artifacts, result));

	}

	private String generateFamoStartScript(TreeLogger logger, LinkerContext context, String selectionScriptText) {

		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++"
		// + selectionScriptText);

		String toReplace = context.getModuleName() + ".succeeded=" + context.getModuleName() + "();";

		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++"
		// + selectionScriptText.indexOf(toReplace));

		selectionScriptText = selectionScriptText.replace(toReplace, "");

		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++"
		// + selectionScriptText.indexOf(toReplace));

		StringBuilder builder = new StringBuilder();
		// builder.append(selectionScriptText);

		builder.append("define(function(require, exports, module) {\n");
		builder.append("require('");
		builder.append(context.getModuleName() + "/" + context.getModuleName() + "-AhomeFamo.js");
		builder.append("');");

		// core
		// builder.append("aitFamoEngine = require('famous/core/Engine');\n");
		// builder.append("aitFamoTransform = require('famous/core/Transform');\n");

		// modifier
		// builder.append("aitFamoStateModifier = require('famous/modifiers/StateModifier');\n");

		// surface
		// builder.append("aitFamoImageSurface = require('famous/surfaces/ImageSurface');\n");

		// inputs
		// builder.append("require('famous/inputs/FastClick');\n");

		// builder.append(toReplace);

		builder.append("\n});");

		String toReturn = builder.toString();
		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++" + toReturn);
		return toReturn;
	}

}