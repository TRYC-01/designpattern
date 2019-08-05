/**
 * FileName: BridgePatternDemo
 * Author:   lenovo
 * Date:     2019/8/6 0:42
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.bridge;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RecCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
