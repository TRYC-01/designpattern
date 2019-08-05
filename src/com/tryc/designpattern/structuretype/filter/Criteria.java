/**
 * FileName: Criteria
 * Author:   lenovo
 * Date:     2019/8/6 0:59
 * Description: 标准接口
 * History:
 */
package com.tryc.designpattern.structuretype.filter;

import java.util.List;

public interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
