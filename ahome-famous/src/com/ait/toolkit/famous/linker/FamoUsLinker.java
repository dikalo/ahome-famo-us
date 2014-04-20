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
	protected String generateSelectionScript(TreeLogger logger,
			LinkerContext context, ArtifactSet artifacts,
			CompilationResult result) throws UnableToCompleteException {
		return generateFamoStartScript(logger, context,
				super.generateSelectionScript(logger, context, artifacts,
						result));

	}

	private String generateFamoStartScript(TreeLogger logger,
			LinkerContext context, String selectionScriptText) {

		String toReplace = context.getModuleName() + ".succeeded = "
				+ context.getModuleName() + "();";

		selectionScriptText = selectionScriptText.replace(toReplace, "");
		StringBuilder builder = new StringBuilder(selectionScriptText);

		builder.append(";\ndefine(function(require, exports, module) {\n");

		builder.append("aitFomImageSurface = require('famous/surfaces/ImageSurface');\n");
		builder.append("aitFamoTransform = require('famous/core/Transform');\n");
		builder.append("aitFamoStateModifier = require('famous/modifiers/StateModifier');\n");
		builder.append("require('famous/inputs/FastClick');\n");
		builder.append(toReplace);
		builder.append("\n});");

		String toReturn = builder.toString();
		// logger.log(TreeLogger.WARN, "++++++++++++++++++++++" + toReturn);
		return toReturn;
	}

}