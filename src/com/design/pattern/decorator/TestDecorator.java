package com.design.pattern.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        Shape c=new Circle();
        c.draw();


        ShapeDecorator shapeDecorator=new RedShapeDecorator(c);
        shapeDecorator.draw();
    }
}
