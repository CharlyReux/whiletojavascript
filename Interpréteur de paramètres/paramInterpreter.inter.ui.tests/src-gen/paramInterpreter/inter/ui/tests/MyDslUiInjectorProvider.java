/*
 * generated by Xtext 2.25.0
 */
package paramInterpreter.inter.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import paramInterpreter.inter.ui.internal.InterActivator;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return InterActivator.getInstance().getInjector("paramInterpreter.inter.MyDsl");
	}

}
