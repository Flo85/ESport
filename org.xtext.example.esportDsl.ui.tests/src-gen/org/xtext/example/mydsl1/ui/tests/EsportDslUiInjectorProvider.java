/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.esportDsl.ui.internal.EsportDslActivator;

public class EsportDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EsportDslActivator.getInstance().getInjector("org.xtext.example.mydsl1.EsportDsl");
	}

}