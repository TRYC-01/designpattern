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

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if ("male".equalsIgnoreCase(person.getGender())) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
