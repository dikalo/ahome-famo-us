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

import java.util.Set;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.AbstractLinker;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.CompilationResult;
import com.google.gwt.core.ext.linker.LinkerOrder;
import com.google.gwt.dev.About;
import com.google.gwt.dev.util.DefaultTextOutput;

/**
 * Linker for the Famo.us library. Makes Famo.us play well with GWT
 */
@LinkerOrder(LinkerOrder.Order.PRE)
public class FamoUsJsGeneratorLinker extends AbstractLinker {

	@Override
	public String getDescription() {
		return "FamoUs Js Generator linker";
	}

	public ArtifactSet link(TreeLogger logger, LinkerContext context, ArtifactSet artifacts) throws UnableToCompleteException {

		ArtifactSet toReturn = new ArtifactSet(artifacts);
		DefaultTextOutput out = new DefaultTextOutput(true);

		out.print("define(function(require, exports, module) {");
		out.newline();

		// get compilation result
		Set<CompilationResult> results = artifacts.find(CompilationResult.class);
		if (results.size() == 0) {
			logger.log(TreeLogger.WARN, "Requested 0 permutations");
			return toReturn;
		}

		CompilationResult result = results.iterator().next();

		String[] javaScript = result.getJavaScript();
		out.print("var $moduleName, $moduleBase;");
		out.newline();
		out.print("var $wnd = $wnd || window.parent; $doc = $wnd.document; ");
		out.newline();
		out.print("var $gwt_version = \"" + About.getGwtVersionNum() + "\";");
		out.newlineOpt();
		out.print(javaScript[0]);
		out.newline();
		out.print("var $stats = function(){};");
		out.newline();
		out.print("var $sessionId = function(){};");
		out.newline();
		out.print("var navigator = $wnd.navigator;");
		out.newline();
		out.print("$strongName = '" + result.getStrongName() + "';");
		out.newline();
		out.newline();
		out.print("gwtOnLoad(null,'" + context.getModuleName() + "',null);");
		out.newline();
		out.print("})");

		out.newline();

		toReturn.add(emitString(logger, out.toString(), context.getModuleName() + "-AhomeFamo.js"));

		return toReturn;
	}

}
