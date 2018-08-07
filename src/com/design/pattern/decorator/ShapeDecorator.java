package com.design.pattern.decorator;

public abstract class ShapeDecorator implements Shape{

    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        this.shape.draw();
    }
}