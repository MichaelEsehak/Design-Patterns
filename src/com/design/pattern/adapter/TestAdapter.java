package com.design.pattern.adapter;

public class TestAdapter {

    public static void main(String[] args) {
        System.out.println(new TriangleCreator().create(0,1,5,5));
        System.out.println(new TriangleCreatorAdabterImpl().create(0,1,5,6));
    }
}
