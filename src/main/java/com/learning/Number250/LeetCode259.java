package com.learning.Number250;

import java.util.ArrayList;
import java.util.List;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定两个以升序排列的整形数组 nums1 和 nums2 , 以及一个整数 k 。
 * <p>
 * 定义一对值 (u,v) ，其中第一个元素来自 nums1 ，第二个元素来自 nums2 。
 * <p>
 * 找到和最小的 k 对数字 (u 1 ,v 1 ), (u 2 ,v 2 ) ... (u k ,v k ) 。
 * <p>
 * 示例 1:
 * <p>
 * 给出： nums1 = [1,7,11], nums2 = [2,4,6], k = 3
 * <p>
 * 返回： [1,2],[1,4],[1,6]
 * <p>
 * 返回序列中的前 3 对数：
 * [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
 * <p>
 * 示例 2:
 * <p>
 * 给出：nums1 = [1,1,2], nums2 = [1,2,3], k = 2
 * <p>
 * 返回： [1,1],[1,1]
 * <p>
 * 返回序列中的前 2 对数：
 * [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
 * <p>
 * 示例 3:
 * <p>
 * 给出：nums1 = [1,2], nums2 = [3], k = 3
 * <p>
 * 返回： [1,3],[2,3]
 * <p>
 * 也可能序列中所有的数对都被返回:
 * [1,3],[2,3]
 * <p>
 * 致谢:
 * 特别感谢 @elmirap 和 @StefanPochmann 添加这个问题并创建所有的测试用例。
 * <p>
 * Created by xuetao on 2020/1/11
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode259 {
    public static void main(String[] args) {
        int[] a = {1, 7, 11};
        int[] b = {2, 4, 6};
        System.out.println(findFirstN(a, b, 3));
    }

    private static List<List<Integer>> findFirstN(int[] a, int[] b, int x) {
        if (a == null || a.length < 1) {
            return null;
        }
        if (b == null || b.length < 1) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();

        outer:
        for (int i = 0, j = a.length; i < j; i++) {
            for (int m = 0, n = b.length; m < n; m++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(a[i]);
                temp.add(b[m]);
                result.add(temp);
                if (result.size() == x) {
                    break outer;
                }
            }

        }
        return result;
    }
}
