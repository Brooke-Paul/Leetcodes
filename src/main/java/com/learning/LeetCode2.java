package com.learning;

/**
 * @Author xuetao
 * @Description: 1.给定两个 非空 链表来表示两个非负整数。位数按照 逆序 方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例：
 * 输入： (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出： 7 -> 0 -> 8
 * 原因： 342 + 465 = 807
 * @Date 2019-04-18
 * @Version 1.0
 */
public class LeetCode2 {

    private int val;

    public LeetCode2 next;

    public LeetCode2(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public LeetCode2 addTwoNumbers(LeetCode2 lc1, LeetCode2 lc2) {
        LeetCode2 leetCode2 = new LeetCode2(0);

        LeetCode2 m = lc1, n = lc2, current = leetCode2;
        int carry = 0;
        while (m != null || n != null) {
            int x = m != null ? m.val : 0;
            int y = n != null ? n.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new LeetCode2(sum % 10);
            current = current.next;

            if (m != null) {
                m = m.next;
            }
            if (n != null) {
                n = n.next;
            }

        }
        if (carry > 0) {
            current.next = new LeetCode2(carry);
        }
        return leetCode2.next;
    }


    public static void main(String[] args) {

        LeetCode2 lc1 = new LeetCode2(2);
        lc1.next = new LeetCode2(4);
        lc1.next.next = new LeetCode2(3);

        LeetCode2 lc2 = new LeetCode2(5);
        lc2.next = new LeetCode2(6);
        lc2.next.next = new LeetCode2(4);
        lc2.next.next.next = new LeetCode2(4);


        LeetCode2 leetCode2 = lc1.addTwoNumbers(lc1, lc2);
        while (leetCode2 != null) {
            System.out.println(leetCode2.val);
            leetCode2 = leetCode2.next;
        }
    }


}
