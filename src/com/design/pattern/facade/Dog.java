package com.design.pattern.facade;

public class Dog implements Animal {
    @Override
    public void feed() {
        System.out.println("Feeding Dog");
    }
}
