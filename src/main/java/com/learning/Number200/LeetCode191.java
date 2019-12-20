package com.learning.Number200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Program Name: leetcodes
 * <p>
 * Description: 给定一个机票的字符串二维数组 [from, to] ，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 出发。
 * <p>
 * 说明:
 * <p>
 * 如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前
 * 所有的机场都用三个大写字母表示（机场代码）。
 * 假定所有机票至少存在一种合理的行程。
 * 示例 1:
 * <p>
 * 输入:
 * 示例 2:
 * <p>
 * 输入:
 * <p>
 * Created by xuetao on 2019/12/20
 *
 * @author xuetao
 * @version 1.0
 */
public class LeetCode191 {
    public static void main(String[] args) {

        String[][] array = {{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
        System.out.println(findItinerary(array));
    }

    public static List<String> findItinerary(String[][] tickets) {
        List<List<String>> allPossibilities = new ArrayList<>();

        List<String[]> JFKStarts = new ArrayList<>();
        for (String[] ticket : tickets) {
            if (ticket[0].equals("JFK")) {
                JFKStarts.add(ticket);
            }
        }

        for (String[] ticket : JFKStarts) {
            List<String> thisPossibility = new ArrayList<>();
            thisPossibility.add(ticket[0]);
            thisPossibility.add(ticket[1]);
            dfs(ticket, thisPossibility, tickets, allPossibilities);
        }

        //sort lexicographically and return the smallest
        Collections.sort(allPossibilities, new ListComparator<>());
        return allPossibilities.get(0);
    }

    private static void dfs(String[] thisTicket, List<String> thisPossibility, String[][] tickets, List<List<String>> allPossibilities) {
        if (thisPossibility.size() == tickets.length + 1) {
            allPossibilities.add(new ArrayList<>(thisPossibility));
            return;
        }
        for (String[] ticket : tickets) {
            if (!ticket.equals(thisTicket) && thisPossibility.get(thisPossibility.size() - 1).equals(ticket[0])) {
                thisPossibility.add(ticket[1]);
                dfs(ticket, thisPossibility, tickets, allPossibilities);
                thisPossibility.remove(thisPossibility.size() - 1);
            }
        }
    }

    private static class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {
        @Override
        public int compare(List<T> o1, List<T> o2) {
            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                int c = o1.get(i).compareTo(o2.get(i));
                if (c != 0) {
                    return c;
                }
            }
            return Integer.compare(o1.size(), o2.size());
        }
    }
}
