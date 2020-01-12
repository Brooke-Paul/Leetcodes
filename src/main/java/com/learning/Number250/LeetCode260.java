package com.learning.Number250;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num) ，它会返回 3 个可能的结果（ -1 ， 1 或 0 ）：
 * <p>
 * -1 : 我的数字比较小
 * 1 : 我的数字比较大
 * 0 : 恭喜！你猜对了！
 * <p>
 * 示例:
 * <p>
 * n = 10, 我选择 6.
 * <p>
 * 返回 6.
 * <p>
 * Created by xuetao on 2020/1/12
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode260 {

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }


    private static int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            int g = guess(mid);
            if (g == 0) {
                return mid;
            } else if (g > 0) {
                left = mid;
            } else {
                right = mid;
            }
        }
        if (guess(left) == 0) {
            return left;
        }
        return right;

    }

    private static int guess(int num) {
        if (num > 6) {
            return -1;
        } else if (num < 6) {
            return 1;
        } else {
            return 0;
        }
    }
}
