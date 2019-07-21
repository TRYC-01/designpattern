/**
 * FileName: ChickenBurger
 * Author:   lenovo
 * Date:     2019/7/21 17:45
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
