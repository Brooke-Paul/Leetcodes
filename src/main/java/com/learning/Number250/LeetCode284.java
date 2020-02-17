package com.learning.Number250;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: com.learning.Number250
 * Description: 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 如果 n 是3的倍数，输出“Fizz”；
 * <p>
 * 如果 n 是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * <p>
 * 示例：
 * <p>
 * n = 15,
 * <p>
 * 返回:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 * Created by xuetao on 2020/2/17
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode284 {
    public static void main(String[] args) {
        System.out.println(findFizzBuzz(15));
    }

    private static List<String> findFizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
