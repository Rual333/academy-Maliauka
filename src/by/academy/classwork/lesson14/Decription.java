package by.academy.classwork.lesson14;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ FIELD, METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Decription {
	String description();

	int quantity();
}
