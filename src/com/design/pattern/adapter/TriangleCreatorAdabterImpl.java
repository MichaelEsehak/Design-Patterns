package com.design.pattern.adapter;

public class TriangleCreatorAdabterImpl extends TriangleCreator implements TriangleCreatorAdabter{

    @Override
    public Triangle create(int x1, int y1, int x2, int y2) {
        return super.create(x1,y1,(x1-x2),(y2-y1));
    }
}
