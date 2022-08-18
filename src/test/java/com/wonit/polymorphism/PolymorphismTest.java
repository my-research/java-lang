package com.wonit.polymorphism;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PolymorphismTest {

    private static final String TARGET_NAME = "com.wonit.polymorphism.Car";

    final CarContainer container = new CarContainer();

    final Car kia = new Kia();
    final Car tesla = new Tesla();

    @BeforeEach
    void setUp() {
        container.add(kia);
        container.add(tesla);
    }

    @Test
    void name() throws Exception {
        Class<?> aClass = Class.forName(TARGET_NAME);

        String name = aClass.getName();
        System.out.println("name = " + name);

    }
}