package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:初始时有 n 个灯泡关闭。 第 1 轮，你打开所有的灯泡。 第 2 轮，每两个灯泡你关闭一次。 第 3 轮，每三个灯泡切换一次开关（如果关闭则打开，如果打开则关闭）。第 i 轮，你每 i 个灯泡切换一次开关。 对于第 n 轮，你只切换最后一个灯泡的开关。 找出 n 轮后有多少个亮着的灯泡。
 * <p>
 * 示例:
 * <p>
 * 输入: 3
 * 输出: 1
 * 解释:
 * 状态off表示灯泡关闭，on表示开启。
 * 初始时, 灯泡状态 [off, off, off].
 * 第一轮后, 灯泡状态 [on, on, on].
 * 第二轮后, 灯泡状态 [on, off, on].
 * 第三轮后, 灯泡状态 [on, off, offå].
 * <p>
 * 你应该返回 1，因为只有一个灯泡还亮着。
 * <p>
 * Created by xuetao on 2019/12/13
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode186 {
    public static void main(String[] args) {
        int array = 7;
        System.out.println(findLightOn(array));
    }

    private static int findLightOn(int n) {
        if (n < 2) {
            return n;
        }
        return (int) Math.sqrt(n);
    }
}
