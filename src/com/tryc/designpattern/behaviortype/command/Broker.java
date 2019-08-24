/**
 * FileName: Broker
 * Author:   lenovo
 * Date:     2019/8/25 0:19
 * Description: 命令调用类
 * History:
 */
package com.tryc.designpattern.behaviortype.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
