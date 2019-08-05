/**
 * FileName: Person
 * Author:   lenovo
 * Date:     2019/8/6 0:57
 * Description: 创建使用标准的类
 * History:
 */
package com.tryc.designpattern.structuretype.filter;

public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
