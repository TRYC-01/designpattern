/**
 * FileName: Blue
 * Author:   lenovo
 * Date:     2019/7/21 15:50
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method");
    }
}
