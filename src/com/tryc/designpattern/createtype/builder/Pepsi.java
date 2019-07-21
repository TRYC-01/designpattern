/**
 * FileName: Pepsi
 * Author:   lenovo
 * Date:     2019/7/21 17:47
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
