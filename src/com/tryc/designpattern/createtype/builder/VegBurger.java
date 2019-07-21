/**
 * FileName: VegBurger
 * Author:   lenovo
 * Date:     2019/7/21 17:44
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
