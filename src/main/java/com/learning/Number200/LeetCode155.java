package com.learning.Number200;

import java.util.Stack;

/**
 * @Author xuetao
 * @Description: 使用栈实现队列的下列操作：
 * <p>
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 注意:
 * <p>
 * 你只能使用标准的栈操作-- 也就是只有 push to top , peek/pop from top , size , 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque (双端队列) 来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 * @Date 2019-11-06
 * @Version 1.0
 */
public class LeetCode155 {
    private static Stack<Object> input = new Stack<>();
    private static Stack<Object> out = new Stack<>();

    public static void main(String[] args) {
        LeetCode155 leetCode155 = new LeetCode155();

        leetCode155.push(1);
        leetCode155.push(2);
        leetCode155.push(3);
        System.out.println(leetCode155.pop());
        System.out.println(leetCode155.pop());
        System.out.println(leetCode155.pop());
        System.out.println(leetCode155.peek());
        System.out.println(leetCode155.peek());
        System.out.println(leetCode155.peek());
        System.out.println(leetCode155.isEmpty());


        System.out.println(input.isEmpty());


    }


    public void push(Object o) {
        input.push(o);
    }

    public Object pop() {
        peek();
        return out.pop();


    }

    public Object peek() {
        if (out.isEmpty()) {
            while (!input.isEmpty()) {
                out.push(input.pop());
            }
        }
        return out.peek();
    }

    public boolean isEmpty() {
        return input.isEmpty() && out.isEmpty();
    }


}
