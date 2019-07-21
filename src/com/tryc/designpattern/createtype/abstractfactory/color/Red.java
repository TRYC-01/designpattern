/**
 * FileName: Red
 * Author:   lenovo
 * Date:     2019/7/21 15:48
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
