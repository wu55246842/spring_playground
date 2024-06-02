package com.wuliang.factory.simple_factory;

import com.wuliang.factory.simple_factory.i.IShape;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("drawing rectangle........");
    }
}
