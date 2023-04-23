package com.github.dhslrl321;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class DynamicProxyTest {

    @Test
    @DisplayName("jdk 동적 프록시")
    void basic() {
        IA a = (IA) Proxy.newProxyInstance(
                IA.class.getClassLoader(),
                new Class[]{IA.class},
                new PrintInvocationHandler(new A()));

        IB b = (IB) Proxy.newProxyInstance(
                IB.class.getClassLoader(),
                new Class[]{IB.class},
                new PrintInvocationHandler(new B()));

        String aActual = a.hello();
        System.out.println("aActual = " + aActual);

        String bActual = b.greeting("good bye");
        System.out.println("bActual = " + bActual);
    }
}