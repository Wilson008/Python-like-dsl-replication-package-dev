/*
 * generated by Xtext 2.25.0
 */
package org.xtext.myjess.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.myjess.ui.internal.MyjessActivator;

public class MyJessUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MyjessActivator.getInstance().getInjector("org.xtext.myjess.MyJess");
	}

}
