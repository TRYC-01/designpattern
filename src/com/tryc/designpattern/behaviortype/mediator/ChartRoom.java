/**
 * FileName: ChartRoom
 * Author:   lenovo
 * Date:     2019/8/25 21:05
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.mediator;

import java.util.Date;

public class ChartRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
