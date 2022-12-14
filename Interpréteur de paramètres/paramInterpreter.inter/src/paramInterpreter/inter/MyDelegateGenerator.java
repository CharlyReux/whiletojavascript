/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package paramInterpreter.inter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.Inject;

import paramInterpreter.inter.generator.MyDslGenerator;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.9
 */
public class MyDelegateGenerator extends GeneratorDelegate {

	@Inject(optional = true)
	private IGenerator legacyGenerator;
	
	@Inject(optional = true)
	private MyDslGenerator generator;
	
	public IGenerator getLegacyGenerator() {
		return legacyGenerator;
	}
	
	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		try {
			beforeGenerate(input, fsa, context);
			generator.doGeneratIndent(input, fsa, context);
		} finally {
			afterGenerate(input, fsa, context);
		}
	}

	@Override
	public void doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (generator != null) {
			generator.doGenerate(input, fsa, context);
		} else if (getLegacyGenerator() != null) {
			getLegacyGenerator().doGenerate(input, fsa);
		}
	}

	@Override
	public void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (generator != null) {
			generator.beforeGenerate(input, fsa, context);
		}
	}

	@Override
	public void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if (generator != null) {
			generator.afterGenerate(input, fsa, context);
		}
	}

	@Override
	public void doGenerate(Resource input, IFileSystemAccess fsa) {
		IFileSystemAccess2 casted = (IFileSystemAccess2) fsa;
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		try {
			beforeGenerate(input, casted, context);
			doGenerate(input, casted, context);
		} finally {
			afterGenerate(input, casted, context);
		}
	}
}
