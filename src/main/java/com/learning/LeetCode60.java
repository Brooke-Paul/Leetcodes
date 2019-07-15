package com.learning;

/**
 * @Author xuetao
 * @Description: 给出集合 [1,2,3,…, _n_ ] ，其所有元素共有 n ! 种排列。
 * <p>
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k ，返回第 k 个排列。
 * <p>
 * 说明：
 * <p>
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1, n !]。
 * 示例 1:
 * <p>
 * 输入: n = 3, k = 3
 * 输出: "213"
 * <p>
 * 示例 2:
 * <p>
 * 输入: n = 4, k = 9
 * 输出: "2314"
 * @Date 2019-07-15
 * @Version 1.0
 */
public class LeetCode60 {
    /**
     * 思路：获取 集合 的所有排列size，求除运算
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = 4;
        int k = 6;

        getPermutation(n, k);
    }

    private static void getPermutation(int n, int k) {
        int sum = 1;
        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
            sum *= i;

        }
        //关键点： k-1 保证array 下标取值正确
        k--;
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            sum = sum / n;
            int x = k / sum;
            k = k % sum;
            stringBuffer.append(array[x]);
            System.out.println(x + "......." + k + "......" + array[x]);

            for (int j = x; j < n - 1; j++) {
                array[j] = array[j + 1];
            }
            System.out.println(stringBuffer);
            n--;
        }


    }
}
