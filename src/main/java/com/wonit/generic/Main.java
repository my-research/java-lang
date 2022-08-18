package com.wonit.generic;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> someClass = Class.forName("com.wonit.generic.StringPrinter").asSubclass(Printer.class);
        Constructor<?> classConstructor = someClass.getConstructor((Class<?>[]) null);

        Printer<Result> printer = (Printer<Result>) classConstructor.newInstance((Object[]) null);

    }
}
