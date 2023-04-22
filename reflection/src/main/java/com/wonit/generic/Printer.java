package com.wonit.generic;

public interface Printer<T extends Result> {
    void print(T aa);
}