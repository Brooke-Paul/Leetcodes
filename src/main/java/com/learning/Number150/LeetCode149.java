package com.learning.Number150;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xuetao
 * @Description: 使用队列实现栈的下列操作：
 * <p>
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 * <p>
 * 你只能使用队列的基本操作-- 也就是 push to back , peek/pop from front , size , 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque (双端队列) 来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的 (例如, 对一个空的栈不会调用 pop 或者 top 操作)。
 * @Date 2019-10-28
 * @Version 1.0
 */
public class LeetCode149 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        myStack.pop();
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }


}

class MyStack {
    Queue<Integer> queue = new LinkedList();

    /**
     * push element x to stack
     *
     * @param x
     */
    public void push(int x) {
        queue.offer(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.offer(queue.remove());
        }

    }

    /**
     * remove the element on the top of stack
     */
    public void pop() {
        queue.poll();
    }

    /**
     * get the top element
     *
     * @return
     */
    public int top() {
        return queue.peek();
    }

    /**
     * return whether the stack is empty
     *
     * @return
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
