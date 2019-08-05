/**
 * FileName: OrCriteria
 * Author:   lenovo
 * Date:     2019/8/6 1:09
 * Description: Or运算
 * History:
 */
package com.tryc.designpattern.structuretype.filter;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(personList);
        List<Person> otherCriterialItems = otherCriteria.meetCriteria(personList);
        for (Person person : otherCriterialItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
