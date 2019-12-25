package com.learning.Number200;

import java.util.*;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给出一个嵌套的整型列表。设计一个迭代器，遍历这个整型列表中的所有整数。
 * <p>
 * 列表中的项或者为一个整数，或者是另一个列表。
 * <p>
 * 示例 1:
 * 给定列表 [[1,1],2,[1,1]] ,
 * <p>
 * 通过重复调用 next 直到 hasNex t 返回false， next 返回的元素的顺序应该是: [1,1,2,1,1] .
 * <p>
 * 示例 2:
 * 给定列表 [1,[4,[6]]] ,
 * <p>
 * 通过重复调用 next 直到 hasNex t 返回false， next 返回的元素的顺序应该是: [1,4,6] .
 * <p>
 * Created by xuetao on 2019/12/24
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode195 {

    private static Queue<Integer> queue;

    public static void main(String[] args) {
        List<NestedInteger> list = new ArrayList<>();
        NestedInteger nestedInteger = new NestedInteger();
        nestedInteger.add(new NestedInteger(1));
        nestedInteger.add(new NestedInteger(3));
        list.add(nestedInteger);
        NestedInteger nestedInteger1 = new NestedInteger(2);
        list.add(nestedInteger1);
        NestedInteger nestedInteger2 = new NestedInteger();
        nestedInteger2.add(new NestedInteger(3));
        nestedInteger2.add(new NestedInteger(1));
        list.add(nestedInteger2);
        NextIterator nextIterator = new NextIterator(list);
        while (nextIterator.hasNext()) {
            System.out.println(nextIterator.next());
        }
    }

    static class NextIterator implements Iterator<Integer> {

        public NextIterator(List<NestedInteger> nestedIntegers) {
            queue = new LinkedList<>();
            constructList(nestedIntegers);

        }

        private void constructList(List<NestedInteger> nestedIntegers) {
            for (NestedInteger nestedInteger : nestedIntegers) {
                if (nestedInteger.isInteger()) {
                    queue.add(nestedInteger.getInteger());
                } else {
                    constructList(nestedInteger.getList());
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public Integer next() {
            return queue.poll();
        }
    }
}

class NestedInteger {
    private List<NestedInteger> list;
    private Integer integer;

    public NestedInteger(List<NestedInteger> list) {
        this.list = list;
    }

    public void add(NestedInteger nestedInteger) {
        if (this.list != null) {
            this.list.add(nestedInteger);
        } else {
            this.list = new ArrayList();
            this.list.add(nestedInteger);
        }
    }

    public void setInteger(int num) {
        this.integer = num;
    }

    public NestedInteger(Integer integer) {
        this.integer = integer;
    }

    public NestedInteger() {
        this.list = new ArrayList();
    }

    public boolean isInteger() {
        return integer != null;
    }

    public Integer getInteger() {
        return integer;
    }

    public List<NestedInteger> getList() {
        return list;
    }

}

