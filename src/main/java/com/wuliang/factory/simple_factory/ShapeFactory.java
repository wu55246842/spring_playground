package com.wuliang.factory.simple_factory;

import com.wuliang.factory.simple_factory.i.IShape;

public class ShapeFactory {
    public IShape getShape(String shapeType){
        switch (shapeType){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
