/**
 * FileName: ShapeFactory
 * Author:   lenovo
 * Date:     2019/8/24 17:51
 * Description: 工厂
 * History:
 */
package com.tryc.designpattern.structuretype.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creataing circle of color:" + color);
        }
        return circle;
    }
}
