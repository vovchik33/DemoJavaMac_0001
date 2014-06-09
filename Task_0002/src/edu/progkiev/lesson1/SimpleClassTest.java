package edu.progkiev.lesson1;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by vladimirkravchenko on 6/10/14.
 */
public class SimpleClassTest {

    public SimpleClassTest() {
    }

    public void run(Class<?> simpleClass) {
        Method[] methods = simpleClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());

            if (method.isAnnotationPresent(Test.class)) {
                Annotation[] annotations = method.getDeclaredAnnotations();
                try {
                    Object instance=simpleClass.newInstance();
                    for (Annotation annotation : annotations)
                        if (annotation instanceof Test) {
                            System.out.println("_ Method with anotation: " + method.getName());
                            System.out.println("_ First parameter: " + ((Test) annotation).param1());
                            System.out.println("_ Second parameter: " + ((Test) annotation).param2());
                            try {
                                System.out.println(method.invoke(instance, new Object[]{
                                        ((Test) annotation).param1(),
                                        ((Test) annotation).param2()
                                }
                                ));
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
