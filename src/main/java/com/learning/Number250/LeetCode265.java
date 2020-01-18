package com.learning.Number250;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 设计一个支持在 平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 * <p>
 * insert(val) ：当元素 val 不存在时，向集合中插入该项。
 * remove(val) ：元素 val 存在时，从集合中移除该项。
 * getRandom ：随机返回现有集合中的一项。每个元素应该有 相同的概率 被返回。
 * 示例 :
 * <p>
 * // 初始化一个空的集合。
 * RandomizedSet randomSet = new RandomizedSet();
 * <p>
 * // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
 * randomSet.insert(1);
 * <p>
 * // 返回 false ，表示集合中不存在 2 。
 * randomSet.remove(2);
 * <p>
 * // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
 * randomSet.insert(2);
 * <p>
 * // getRandom 应随机返回 1 或 2 。
 * randomSet.getRandom();
 * <p>
 * // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
 * randomSet.remove(1);
 * <p>
 * // 2 已在集合中，所以返回 false 。
 * randomSet.insert(2);
 * <p>
 * // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
 * randomSet.getRandom();
 * <p>
 * Created by xuetao on 2020/1/18
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode265 {
    public static void main(String[] args) {
        RandomizedSet randomSet = new RandomizedSet();
        randomSet.insert(1);
        System.out.println(randomSet.remove(2));
        randomSet.insert(2);
        System.out.println(randomSet.getRandom());
        System.out.println(randomSet.remove(1));
        randomSet.insert(2);
        System.out.println(randomSet.getRandom());
        System.out.println(randomSet.getList());

    }

}

class RandomizedSet {

    private List<Integer> list = new ArrayList<>();

    private static Random random = new Random();

    public void insert(int val) {
        if (!list.contains(val)) {
            list.add(val);
        }
    }

    public boolean remove(Integer val) {
        return list.remove(val);
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public List getList() {
        return list;
    }
}
