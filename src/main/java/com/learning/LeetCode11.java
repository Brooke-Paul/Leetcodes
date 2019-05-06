package com.learning;

/**
 * @Author xuetao
 * @Description: 给定 n 个非负整数 a 1 ， a 2， ...， a n， 每个数代表坐标中的一个点 ( i , a i ) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 ( i , a i ) 和 ( i , 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 注意： 你不能倾斜容器， n 至少是2。
 * @Date 2019-05-06
 * @Version 1.0
 */
public class LeetCode11 {


    public static void main(String[] args) {
        int[] height = {2, 5, 8, 1, 3, 9};
        //24
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            max = Math.max(max, (r - l) * Math.min(height[l], height[r]));
            //如果头的值比尾的值小，说明当前短板是头，则i++，反之，j--;
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }
        return max;
    }
}
