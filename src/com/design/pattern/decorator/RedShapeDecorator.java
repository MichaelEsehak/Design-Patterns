package com.design.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    Shape shape;
    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape=shape;
    }

    public void draw(){
        shape.draw();
        System.out.println("circle was colored with red");
    }
}
