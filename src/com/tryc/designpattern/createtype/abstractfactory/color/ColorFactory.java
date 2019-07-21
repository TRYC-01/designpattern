/**
 * FileName: ColorFactory
 * Author:   lenovo
 * Date:     2019/7/21 16:07
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.color;

import com.tryc.designpattern.createtype.abstractfactory.AbstractFactory;
import com.tryc.designpattern.createtype.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        }
        if (colorType.equalsIgnoreCase("green")) {
            return new Green();
        }
        if (colorType.equalsIgnoreCase("blue")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
