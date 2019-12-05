package com.learning.Number200;

/**
 * Program Name: leetcodes
 * <p>
 * Description:你正在和你的朋友玩 猜数字(Bulls and Cows) 游戏：你写下一个数字让你的朋友猜。每次他猜测后，你给他一个提示，告诉他有多少位数字和确切位置都猜对了（称为”Bulls“, 公牛），有多少位数字猜对了但是位置不对（称为“Cows“, 奶牛）。你的朋友将会根据提示继续猜，直到猜出秘密数字。
 * <p>
 * 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，用 A 表示公牛，用 B 表示奶牛。
 * <p>
 * 请注意秘密数字和朋友的猜测数都可能含有重复数字。
 * <p>
 * 示例 1:
 * <p>
 * 输入: secret = "1807", guess = "7810"
 * <p>
 * 输出: "1A3B"
 * <p>
 * 解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
 * <p>
 * 示例 2:
 * <p>
 * 输入: secret = "1123", guess = "0111"
 * <p>
 * 输出: "1A1B"
 * <p>
 * 解释: 朋友猜测数中的第一个 1 是公牛，第二个和第三个 1 是奶牛。
 * <p>
 * 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且他们的长度永远相等。
 * <p>
 * Created by xuetao on 2019/12/4
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode178 {
    public static void main(String[] args) {
        String secret = "1123";
        String guess = "0111";
        System.out.println(getHint(secret, guess));
    }

    private static String getHint(String secret, String guess) {
        int[] secretCows = new int[10];
        int[] guessCows = new int[10];
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (guess.charAt(i) == secret.charAt(i)) {
                bulls++;
            } else {
                secretCows[Character.getNumericValue(secret.charAt(i))]++;
                guessCows[Character.getNumericValue(guess.charAt(i))]++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCows[i], guessCows[i]);
        }
        return bulls + "A" + cows + "B";
    }

}
