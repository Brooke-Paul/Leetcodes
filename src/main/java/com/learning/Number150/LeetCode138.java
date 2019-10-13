package com.learning.Number150;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xuetao
 * @Description: 现在你总共有 n 门课需要选，记为 0 到 n-1 。
 * <p>
 * 在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]
 * <p>
 * 给定课程总量以及它们的先决条件，判断是否可能完成所有课程的学习？
 * <p>
 * 示例 1:
 * <p>
 * 输入: 2, [[1,0]]
 * 输出: true
 * 解释: 总共有 2 门课程。学习课程 1 之前，你需要完成课程 0。所以这是可能的。
 * <p>
 * 示例 2:
 * <p>
 * 输入: 2, [[1,0],[0,1]]
 * 输出: false
 * 解释: 总共有 2 门课程。学习课程 1 之前，你需要先完成​课程 0；并且学习课程 0 之前，你还应先完成课程 1。这是不可能的。
 * <p>
 * 说明:
 * <p>
 * 输入的先决条件是由 边缘列表 表示的图形，而不是邻接矩阵。详情请参见 图的表示法 。
 * 你可以假定输入的先决条件中没有重复的边。
 * 提示:
 * <p>
 * 这个问题相当于查找一个循环是否存在于有向图中。如果存在循环，则不存在拓扑排序，因此不可能选取所有课程进行学习。
 * 通过 DFS 进行拓扑排序 - 一个关于Coursera的精彩视频教程（21分钟），介绍拓扑排序的基本概念。
 * 拓扑排序也可以通过 BFS 完成。
 * @Date 2019-10-13
 * @Version 1.0
 */
public class LeetCode138 {

    public static void main(String[] args) {
        int[][] array = {{1, 1}};
        int n = 3;
        System.out.println(courseSequence(n, array));
    }

    private static boolean courseSequence(int n, int[][] array) {

        Map<Integer, Integer> map = new HashMap();

        int len = array.length;
        for (int i = 0; i < len; i++) {
            int[] result = array[i];

            // 课程不在列表中，return false
            if (result[0] > n - 1 || result[1] > n - 1) {
                return false;
            }

            // key == value return false
            if (result[0] == result[1]) {
                return false;
            }


            // key 与 value 有一个相同 return false
            if (map.containsKey(result[0]) || map.containsValue(result[1])) {
                return false;
            }
            map.put(result[0], result[1]);
        }
        return true;

    }


}
