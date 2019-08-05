/**
 * FileName: CriteriaMale
 * Author:   lenovo
 * Date:     2019/8/6 1:00
 * Description:
 * History:
 */
package com.tryc.designpattern.structuretype.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if ("single".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
