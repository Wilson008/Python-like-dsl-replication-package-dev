/*
 * generated by Xtext 2.25.0
 */
package org.xtext.mycsm.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.mycsm.ui.internal.MycsmActivator;

public class MyCsmUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MycsmActivator.getInstance().getInjector("org.xtext.mycsm.MyCsm");
	}

}
