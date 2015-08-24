package org.jbehave.core.annotations.needle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.needle4j.injection.InjectionProvider;
import org.needle4j.injection.InjectionProviderInstancesSupplier;

/**
 * Indicates usage of Needle as DI.
 * 
 * @author Simon Zambrovski (simon.zambrovski@holisticon.de)
 * @author Jan Galinski (jan.galinski@holisticon.de)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface UsingNeedle {

	/**
	 * Injection provider supplier.
	 * 
	 * @return list of suppliers.
	 */
	Class<? extends InjectionProviderInstancesSupplier>[] supplier() default {};

	/**
	 * Injection providers.
	 * 
	 * @return list of providers.
	 */
	Class<? extends InjectionProvider<?>>[] provider() default {};

}
