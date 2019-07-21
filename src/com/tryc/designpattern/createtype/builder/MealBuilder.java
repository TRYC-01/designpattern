/**
 * FileName: MealBuilder
 * Author:   lenovo
 * Date:     2019/7/21 17:56
 * Description:
 * History:
 */
package com.tryc.designpattern.createtype.builder;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
