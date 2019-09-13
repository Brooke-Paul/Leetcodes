package com.learning.Number150;

import java.util.Stack;

/**
 * @Author xuetao
 * @Description: 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); --> 返回 -3.
 * minStack.pop();
 * minStack.top(); --> 返回 0.
 * minStack.getMin(); --> 返回 -2.
 * @Date 2019-09-13
 * @Version 1.0
 */
public class LeetCode112 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        minStack.getMin();
    }

}

class MinStack {

    private static Stack<Integer> stack = new Stack<>();
    private static int min = Integer.MAX_VALUE;

    public int getMin() {
        System.out.println(min);
        return min;
    }

    /**
     * push 时如果当前值小于最小值，push到栈中，后进先出
     *
     * @param num
     */
    public void push(int num) {
        if (num <= min) {
            stack.push(min);
            min = num;
        }
        stack.push(num);
    }

    public void pop() {
        if (min == stack.peek()) {
            stack.pop();
            min = stack.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        System.out.println(stack.peek());
        return stack.peek();
    }
}
