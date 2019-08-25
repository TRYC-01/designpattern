/**
 * FileName: User
 * Author:   lenovo
 * Date:     2019/8/25 21:04
 * Description:
 * History:
 */
package com.tryc.designpattern.behaviortype.mediator;

public class User {
    private String name;

    public void sendMessage(String message) {
        ChartRoom.showMessage(this,message);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
