package com.design;

import com.design.pattern.builder.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car=new Car.CarBuilder().setColor("white").setManufacturer("michael").setModel("2008").setNumberPlate("ABC123").setPrice(1221.40).build();

        System.out.println(car);
    }
}
