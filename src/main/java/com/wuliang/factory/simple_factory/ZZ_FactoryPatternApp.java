package com.wuliang.factory.simple_factory;

import com.wuliang.factory.simple_factory.i.IShape;

public class ZZ_FactoryPatternApp {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
