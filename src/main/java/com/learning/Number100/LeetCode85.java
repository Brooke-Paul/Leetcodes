package com.learning.Number100;

/**
 * @Author xuetao
 * @Description: 给定一个字符串 s1 ，我们可以把它递归地分割成两个非空子字符串，从而将其表示为二叉树。
 * <p>
 * 下图是字符串 s1 = "great" 的一种可能的表示形式。
 * <p>
 * great
 * /
 * gr eat
 * / \ /
 * g r e at
 * /
 * a t
 * <p>
 * 在扰乱这个字符串的过程中，我们可以挑选任何一个非叶节点，然后交换它的两个子节点。
 * <p>
 * 例如，如果我们挑选非叶节点 "gr" ，交换它的两个子节点，将会产生扰乱字符串 "rgeat" 。
 * <p>
 * rgeat
 * /
 * rg eat
 * / \ /
 * r g e at
 * /
 * a t
 * <p>
 * 我们将 "rgeat” 称作 "great" 的一个扰乱字符串。
 * <p>
 * 同样地，如果我们继续将其节点 "eat" 和 "at" 进行交换，将会产生另一个新的扰乱字符串 "rgtae" 。
 * <p>
 * rgtae
 * /
 * rg tae
 * / \ /
 * r g ta e
 * /
 * t a
 * <p>
 * 我们将 "rgtae” 称作 "great" 的一个扰乱字符串。
 * <p>
 * 给出两个长度相等的字符串 s1 和 s2 ，判断 s2 是否是 s1 的扰乱字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s1 = "great", s2 = "rgeat"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s1 = "abcde", s2 = "caebd"
 * 输出: false
 * @Date 2019-08-15
 * @Version 1.0
 */
public class LeetCode85 {
    public static void main(String[] args) {
        String str1 = "great";
        String str2 = "rgeat";

        isScramble(str1, str2);
    }

    public static boolean isScramble(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] letters = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            letters[s1.charAt(i) - 'a']++;
            letters[s2.charAt(i) - 'a']--;
        }

        for (int i : letters) {
            if (i != 0) {
                return false;
            }
        }

        for (int i = 1; i < s1.length(); i++) {
            if (isScramble(s1.substring(0, i), s2.substring(0, i)) && isScramble(
                    s1.substring(i), s2.substring(i))) {
                return true;
            }
            if (isScramble(s1.substring(0, i), s2.substring(s2.length() - i)) && isScramble(
                    s1.substring(i), s2.substring(0, s2.length() - i))) {
                return true;
            }
        }
        return false;
    }


}
