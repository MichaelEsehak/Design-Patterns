package com.design.pattern.builder;

public class TestBuilder {

    public static void main(String[] args) {

        Car car = new Car.CarBuilder().setColor("white").setManufacturer("michael").setModel("2008").setNumberPlate("ABC123").setPrice(1221.40).build();

        System.out.println(car);
    }
}
