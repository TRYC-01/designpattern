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

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if ("female".equalsIgnoreCase(person.getGender())) {
                femalePersonList.add(person);
            }
        }
        return femalePersonList;
    }
}
