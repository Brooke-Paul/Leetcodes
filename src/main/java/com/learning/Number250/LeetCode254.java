package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个非负整数 n，计算各位数字都不同的数字 x 的个数，其中 0 ≤ x < 10 n 。
 * <p>
 * 示例:
 * 给定 n = 2，返回 91。（答案应该是除 [11,22,33,44,55,66,77,88,99] 外，0 ≤ x < 100 间的所有数字）
 * <p>
 * 致谢:
 * 特别感谢 @memoryless 添加这个题目并创建所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/4
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode254 {
    public static void main(String[] args) {
        System.out.println(countNumbersWithUniqueDigits(3));
    }

    private static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int res = 10;
        int uniqueDigits = 9;
        int availableNum = 9;
        while (n-- > 1 && availableNum > 0) {
            uniqueDigits = uniqueDigits * availableNum;
            res += uniqueDigits;
            availableNum--;
        }
        return res;
    }
}
