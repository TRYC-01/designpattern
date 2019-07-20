/**
 * FileName: ShapeFactory
 * Author:   lenovo
 * Date:     2019/7/21 0:30
 * Description: shape工厂
 * History:
 */
package com.tryc.designpattern.createtype.factory;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
