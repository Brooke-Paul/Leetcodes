package com.learning.Number250;


import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 假设有打乱顺序的一群人站成一个队列。 每个人由一个整数对 (h, k) 表示，其中 h 是这个人的身高， k 是排在这个人前面且身高大于或等于 h 的人数。 编写一个算法来重建这个队列。
 * <p>
 * 注意：
 * 总人数少于1100人。
 * <p>
 * 示例
 * <p>
 * 输入:
 * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
 * <p>
 * 输出:
 * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 * <p>
 * Created by xuetao on 2020/2/10
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode281 {
    public static void main(String[] args) {
        int[][] array = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        System.out.println(reconstructQueue(array));
    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                return p1[0] != p2[0] ? Integer.compare(p2[0], p1[0]) : Integer.compare(p1[1], p2[1]);
            }
        });
        List<int[]> list = new LinkedList();
        for (int[] ppl : people) {
            list.add(ppl[1], ppl);
        }
        return list.toArray(new int[people.length][]);
    }
}

