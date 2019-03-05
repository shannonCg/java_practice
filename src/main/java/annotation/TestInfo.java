package annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Retention(RUNTIME)
@Target(TYPE) //on class level
public @interface TestInfo {
	enum Priority{
		Low, Medium, High
	}
	
	Priority priority() default Priority.Medium;
	String[] tags() default "";
	String createBy() default "Shannon";
	String lastModified() default "01/01/2017";
}
