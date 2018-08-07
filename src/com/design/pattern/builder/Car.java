package com.design.pattern.builder;

public class Car {

    private String manufacturer;
    private String color;
    private String model;
    private Double price;
    private String numberPlate;

    private Car(CarBuilder carBuilder){
        this.manufacturer=carBuilder.manufacturer;
        this.color=carBuilder.color;
        this.model=carBuilder.model;
        this.price=carBuilder.price;
        this.numberPlate=carBuilder.numberPlate;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", numberPlate='" + numberPlate + '\'' +
                '}';
    }

    public static class CarBuilder{
        private String manufacturer;
        private String color;
        private String model;
        private Double price;
        private String numberPlate;


        public CarBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public CarBuilder setNumberPlate(String numberPlate) {
            this.numberPlate = numberPlate;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
