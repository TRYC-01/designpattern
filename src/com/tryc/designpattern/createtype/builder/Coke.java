/**
 * FileName: Coke
 * Author:   lenovo
 * Date:     2019/7/21 17:46
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
