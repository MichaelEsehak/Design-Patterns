package com.design.pattern.adapter;

public class TriangleCreator {

    public Triangle create(int x, int y, int w, int h) {
        return new Triangle(x, y, w, h);
    }
}
