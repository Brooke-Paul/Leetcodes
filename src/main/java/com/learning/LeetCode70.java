package com.learning;

import java.util.Stack;

/**
 * @Author xuetao
 * @Description: 给定一个文档 (Unix-style) 的完全路径，请进行路径简化。
 * <p>
 * 例如，
 * path = "/home/" , => "/home"
 * path = "/a/./b/../../c/" , => "/c"
 * <p>
 * 边界情况:
 * <p>
 * 你是否考虑了 路径 = "/../" 的情况？
 * 在这种情况下，你需返回 "/" 。
 * 此外，路径中也可能包含多个斜杠 '/' ，如 "/home//foo/" 。
 * 在这种情况下，你可忽略多余的斜杠，返回 "/home/foo" 。
 * @Date 2019-07-25
 * @Version 1.0
 */
public class LeetCode70 {
    /**
     * 思路： 去掉 .., ., // 中的 /
     * 字符串分隔
     *
     * @param args
     */
    public static void main(String[] args) {
        String path = "/a/./b/../1/c/";
        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        String[] array = path.split("/");
        int length = array.length;
        Stack s = new Stack();
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < length; i++) {
            if (array[i].equals("") || array[i].equals(".") || (array[i].equals("..") && s.isEmpty())) {
                continue;
            } else if (array[i].equals("..") && !s.isEmpty()) {
                s.pop();
            } else {
                s.push(array[i]);
            }
        }
        if (s.isEmpty()) {
            return "/";
        } else {
            Object[] a = s.toArray();
            for (int i = 0; i < a.length; i++) {
                res.append("/" + a[i].toString());
            }
            return res.toString();
        }
    }
}
