/**
 * FileName: ShapeFactory
 * Author:   lenovo
 * Date:     2019/7/21 15:53
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.shape;

import com.tryc.designpattern.createtype.abstractfactory.AbstractFactory;
import com.tryc.designpattern.createtype.abstractfactory.color.Color;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
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
