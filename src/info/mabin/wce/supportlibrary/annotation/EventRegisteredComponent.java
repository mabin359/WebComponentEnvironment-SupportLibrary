package info.mabin.wce.supportlibrary.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * for Event of Registered Component
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventRegisteredComponent {
	/**
	 * PackageName of Target Component
	 */
	String[] value() default {};
}
