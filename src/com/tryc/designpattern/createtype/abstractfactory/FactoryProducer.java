/**
 * FileName: FactoryProducer
 * Author:   lenovo
 * Date:     2019/7/21 16:09
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory;

import com.tryc.designpattern.createtype.abstractfactory.color.ColorFactory;
import com.tryc.designpattern.createtype.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) {
            throw new IllegalArgumentException("please pass a type param");
        }
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        throw new IllegalArgumentException("please pass a correct type param");
    }
}
