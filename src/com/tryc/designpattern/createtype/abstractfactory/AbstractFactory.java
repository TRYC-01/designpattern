/**
 * FileName: AbstractFactory
 * Author:   lenovo
 * Date:     2019/7/21 15:51
 * Description: 抽象工厂
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory;

import com.tryc.designpattern.createtype.abstractfactory.color.Color;
import com.tryc.designpattern.createtype.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
