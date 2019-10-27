package com.learning.Number150;

/**
 * @Author xuetao
 * @Description: 在 二维 平面上计算出两个 由直线构成的 矩形叠加覆盖后的面积。
 * <p>
 * 每个矩形由其左下顶点和右上顶点坐标表示，如图所示。
 * <p>
 * Rectangle Area
 * <p>
 * 示例:
 * <p>
 * 输入: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
 * 输出: 45
 * <p>
 * 说明:
 * <p>
 * 假设矩形面积不会超出 int 的范围。
 * @Date 2019-10-27
 * @Version 1.0
 */
public class LeetCode148 {
    public static void main(String[] args) {
        int A = -3;
        int B = 0;
        int C = 3;
        int D = 4;
        int E = 0;
        int F = -1;
        int G = 9;
        int H = 2;
        System.out.println(computeArea(A, B, C, D, E, F, G, H));

    }

    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int areaA = (C - A) * (D - B);
        int areaB = (G - E) * (H - F);

        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        int left = Math.max(A, E);
        int right = Math.min(C, G);

        int overlap = 0;
        if (top > bottom && right > left) {
            overlap = (top - bottom) * (right - left);
        }
        return areaA + areaB - overlap;
    }
}
