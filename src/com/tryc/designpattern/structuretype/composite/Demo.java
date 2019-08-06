/**
 * FileName: Demo
 * Author:   lenovo
 * Date:     2019/8/7 1:33
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.composite;

public class Demo {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO", 30000);
        Employee headSale = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecution1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecution2 = new Employee("Rob", "Sales", 10000);

        ceo.add(headSale);
        ceo.add(headMarketing);
        headSale.add(salesExecution1);
        headSale.add(salesExecution2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }

    }
}
