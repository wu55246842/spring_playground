package com.wuliang.factory.simple_factory;

import com.wuliang.factory.simple_factory.i.IShape;

public class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("drawing circle........");
    }
}
