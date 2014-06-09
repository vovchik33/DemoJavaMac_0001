package edu.progkiev.lesson1;

import java.lang.annotation.*;

/**
 * Created by vladimirkravchenko on 6/10/14.
 */
@Inherited
@Target(value=ElementType.METHOD)
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Test {
    String param1() default "noname";
    String param2() default "noname";
}
