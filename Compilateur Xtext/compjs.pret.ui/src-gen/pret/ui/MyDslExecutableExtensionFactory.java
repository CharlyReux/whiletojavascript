/*
 * generated by Xtext 2.25.0
 */
package pret.ui;

import com.google.inject.Injector;
import compjs.pret.ui.internal.PretActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(PretActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		PretActivator activator = PretActivator.getInstance();
		return activator != null ? activator.getInjector(PretActivator.PRET_MYDSL) : null;
	}

}
