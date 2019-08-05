/**
 * FileName: FilterDemo
 * Author:   lenovo
 * Date:     2019/8/6 1:12
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Robert", "male", "single"));
        personList.add(new Person("John", "male", "married"));
        personList.add(new Person("Laura", "female", "married"));
        personList.add(new Person("Diana", "female", "single"));
        personList.add(new Person("Mike", "male", "single"));
        personList.add(new Person("Bobby", "male", "single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single,female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(personList));
        System.out.println("\nFemales:");
        printPersons(female.meetCriteria(personList));
        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(personList));
        System.out.println("\nSingle Or Female");
        printPersons(singleOrFemale.meetCriteria(personList));

    }

    public static void printPersons(List<Person> personList) {
        for (Person person : personList) {
            System.out.println("Person: [name :" + person.getName() + ", Gender :" + person.getGender() + ", Marital Status: " + person.getMaritalStatus() + " ]");
        }
    }
}
