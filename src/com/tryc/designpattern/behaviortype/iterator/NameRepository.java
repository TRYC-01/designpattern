/**
 * FileName: NameRepository
 * Author:   lenovo
 * Date:     2019/8/25 17:02
 * Description: 实现了Container的实体类。该类有实现了Iterator接口的内部类NameIterator
 *
 * History:
 */
package com.tryc.designpattern.behaviortype.iterator;

public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;
        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
