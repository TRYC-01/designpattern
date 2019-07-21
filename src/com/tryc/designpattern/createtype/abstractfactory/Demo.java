/**
 * FileName: Demo
 * Author:   lenovo
 * Date:     2019/7/21 16:13
 * Description: 抽象工厂示例
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory;

import com.tryc.designpattern.createtype.abstractfactory.color.Color;
import com.tryc.designpattern.createtype.abstractfactory.shape.Shape;

public class Demo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        circle.draw();
        rectangle.draw();
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color red = colorFactory.getColor("red");
        Color green = colorFactory.getColor("green");
        Color blue = colorFactory.getColor("blue");
        red.fill();
        green.fill();
        blue.fill();

    }
}
