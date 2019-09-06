package com.learning.Number100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xuetao
 * @Description: 格雷编码是一个二进制数字系统，在该系统中，两个连续的数值仅有一个位数的差异。
 * <p>
 * 给定一个代表编码总位数的非负整数 n，打印格雷码序列。格雷码序列必须以 0 开头。
 * <p>
 * 例如，给定 n = 2，返回 [0,1,3,2] 。其格雷编码是：
 * <p>
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * <p>
 * 说明:
 * <p>
 * 对于给定的 n ，其格雷编码的顺序并不唯一。
 * <p>
 * 例如 [0,2,3,1] 也是一个有效的格雷编码顺序。
 * @Date 2019-08-18
 * @Version 1.0
 */
public class LeetCode87 {

    public static void main(String[] args) {
        List<Integer> list = grayCode(3);
        list.forEach(i -> {
            System.out.println(i);
        });
    }

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i < (1 << n); i++) {
            int x = i >> 1;
            System.out.println("x " + x + "i " + i);
            //异或运算取反，相同为0，不同为1
            result.add(i ^ x);
        }
        return result;
    }
}
