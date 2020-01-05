package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 有两个容量分别为 x 升 和 y 升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z 升 的水？
 * <p>
 * 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。
 * <p>
 * 你允许：
 * <p>
 * 装满任意一个水壶
 * 清空任意一个水壶
 * 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 * 示例1: (From the famous "Die Hard" example )
 * <p>
 * 输入: x = 3, y = 5, z = 4
 * 输出: True
 * <p>
 * 示例2:
 * <p>
 * 输入: x = 2, y = 6, z = 5
 * 输出: False
 * <p>
 * 致谢:
 * 感谢 @vinod23 添加这个问题并创建所有测试用例。
 * <p>
 * Created by xuetao on 2020/1/5
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode255 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 4;
        System.out.println(canMeasureWater(x, y, z));
    }

    private static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }


        if (x == z || y == z || x + y == z) {
            return true;
        }
        return z % gc(x, y) == 0;

    }

    private static int gc(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
