package com.learning.Number200;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 给定一个迭代器类的接口，接口包含两个方法： next() 和 hasNext() 。设计并实现一个支持 peek() 操作的顶端迭代器 -- 其本质就是把原本应由 next() 方法返回的元素 peek() 出来。
 * <p>
 * 示例:
 * <p>
 * 假设迭代器被初始化为列表 [1,2,3]。
 * <p>
 * 调用 **next()**返回 1，得到列表中的第一个元素。
 * 现在调用 peek() 返回 2，下一个元素。在此之后调用 next() 仍然返回 2。
 * 最后一次调用 next() 返回 3，末尾元素。在此之后调用 hasNext() 应该返回 false。
 * <p>
 * 进阶： 你将如何拓展你的设计？使之变得通用化，从而适应所有的类型，而不只是整数型？
 * @Date 2019-11-28
 * @Version 1.0
 */
public class LeetCode173 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        PeekIterator peekIterator = new PeekIterator(list.iterator());
        System.out.println(peekIterator.hasNext());
        System.out.println(peekIterator.next());
        System.out.println(peekIterator.peek());
        System.out.println(peekIterator.hasNext());
        System.out.println(peekIterator.next());
        System.out.println(peekIterator.peek());
        System.out.println(peekIterator.hasNext());
        System.out.println(peekIterator.next());
        System.out.println(peekIterator.peek());


    }

    public static class PeekIterator implements Iterator<Integer> {

        private Queue<Integer> queue;

        public PeekIterator(Iterator<Integer> iterator) {
            queue = new LinkedList<>();
            while (iterator.hasNext()) {
                queue.add(iterator.next());
            }
        }

        public Integer peek() {
            return queue.peek();
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
