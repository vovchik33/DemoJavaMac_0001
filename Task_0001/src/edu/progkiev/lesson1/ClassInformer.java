package edu.progkiev.lesson1;

import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created by vladimirkravchenko on 6/9/14.
 */
public class ClassInformer {
    public static void printClassInfo(Class param) {
        System.out.println(getClassName(param));
        System.out.println(getClassModifiers(param));
        System.out.println(getClassFields(param));
        System.out.println(getClassMethods(param));
    }

    private static String getClassName(Class param) {
        StringBuilder builder = new StringBuilder();
        builder.append("ClassName{").append("\n");
        builder.append(param.getName()).append("\n");
        builder.append("}");
        return builder.toString();
    }

    private static String getClassModifiers(Class param) {
        StringBuilder builder = new StringBuilder();
        builder.append("Modifiers{").append("\n");
        builder.append(Modifier.toString(param.getModifiers())).append("\n");
        builder.append("}");
        return builder.toString();
    }
    private static String getClassFields(Class param) {
        StringBuilder builder = new StringBuilder();
        builder.append("Fields{").append("\n");
        builder.append(Arrays.asList(param.getDeclaredFields()).toString()).append("\n");
        builder.append("}");
        return builder.toString();
    }
    private static String getClassMethods(Class param) {
        StringBuilder builder = new StringBuilder();
        builder.append("Methods{").append("\n");
        builder.append(Arrays.asList(param.getDeclaredMethods()).toString()).append("\n");
        builder.append("}");
        return builder.toString();
    }

}
