package com.wonit.generic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

class GenericReflectionTest {
    @Test
    void name()
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> someClass = Class.forName("com.wonit.generic.FancyStringPrinter");

        Class<? extends Printer> creatorClass = someClass.asSubclass(Printer.class);

        Constructor<? extends Printer> classConstructor = creatorClass.getConstructor((Class<?>[]) null);

        Printer<String> printer = (Printer<String>) classConstructor.newInstance((Object[]) null);

        String s = printer.print("good");
        System.out.println("s = " + s);
    }
}