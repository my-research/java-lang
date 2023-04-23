package com.github.dhslrl321;

public class B implements IB{
    @Override
    public String greeting(String message) {
        return message.toUpperCase();
    }
}
