package com.learning.Number250;

import java.util.Arrays;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一些标记了宽度和高度的信封，宽度和高度以整数对形式 (w, h) 出现。当另一个信封的宽度和高度都比这个信封大的时候，这个信封就可以放进另一个信封里，如同俄罗斯套娃一样。
 * <p>
 * 请计算最多能有多少个信封能组成一组“俄罗斯套娃”信封（即可以把一个信封放到另一个信封里面）。
 * <p>
 * 示例:
 * <p>
 * 输入: envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * 输出: 3
 * 解释: 最多信封的个数为 3, 组合为: [2,3] => [5,4] => [6,7]。
 * <p>
 * Created by xuetao on 2020/1/3
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode253 {
    public static void main(String[] args) {
        int[][] array = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(maxEnvelopes(array));
    }

    public static int maxEnvelopes(int[][] envelopes) {
        if (envelopes == null || envelopes.length == 0
                || envelopes[0].length == 0 || envelopes[0].length != 2) {
            return 0;
        }
        Arrays.sort(envelopes, (int[] a, int[] b) -> {
                    if (a[0] == b[0]) {
                        return b[1] - a[1];
                    } else {
                        return a[0] - b[0];
                    }
                }
        );
        int[] dp = new int[envelopes.length];
        int len = 0;
        for (int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if (index < 0) {
                index = -(index + 1);
            }
            dp[index] = envelope[1];
            if (index == len) {
                len++;
            }
        }
        return len;
    }
}
