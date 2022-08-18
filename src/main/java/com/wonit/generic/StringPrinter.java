package com.wonit.generic;

public class StringPrinter implements Printer<SimpleResult> {

    private String message;

    public StringPrinter() {
    }

    public StringPrinter(String message) {
        this.message = message;
    }

    @Override
    public void print(SimpleResult aa) {

    }
}