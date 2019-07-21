/**
 * FileName: Green
 * Author:   lenovo
 * Date:     2019/7/21 15:49
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.abstractfactory.color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}
