package com.learning.Number250;

import java.util.*;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 打乱一个没有重复元素的数组。
 * <p>
 * 示例:
 * <p>
 * // 以数字集合 1, 2 和 3 初始化数组。
 * int[] nums = {1,2,3};
 * Solution solution = new Solution(nums);
 * <p>
 * // 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
 * solution.shuffle();
 * <p>
 * // 重设数组到它的初始状态[1,2,3]。
 * solution.reset();
 * <p>
 * // 随机返回数组[1,2,3]打乱后的结果。
 * solution.shuffle();
 * <p>
 * Created by xuetao on 2020/1/22
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode269 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution(nums);

        for (int i : solution.shuffle()) {
            System.out.print(i);
        }
        System.out.println("");

        solution.reset();
        for (int i : solution.shuffle()) {
            System.out.print(i);
        }
        System.out.println("");

        for (int i : solution.shuffle()) {
            System.out.print(i);
        }
        System.out.println("");

        for (int i : solution.shuffle()) {
            System.out.print(i);
        }
        System.out.println("");
        for (int i : solution.shuffle()) {
            System.out.print(i);
        }
        System.out.println("");
    }
}

class Solution {
    private int[] array;

    private Random random = new Random();


    public Solution(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] shuffle() {
        Set set = new HashSet();
        for (int i = 0; i < array.length; i++) {
            int next = random.nextInt(array.length);
            if (!set.contains(next)) {
                set.add(next);
                int temp = array[i];
                array[i] = array[next];
                array[next] = temp;
            }

        }
        return array;
    }


    public void reset() {
        Arrays.sort(array);
    }

}
