package com.learning.Number150;

import java.util.*;

/**
 * @Author xuetao
 * @Description: 实现一个 Trie (前缀树)，包含 insert , search , 和 startsWith 这三个操作。
 * <p>
 * 示例:
 * <p>
 * Trie trie = new Trie();
 * <p>
 * trie.insert("apple");
 * trie.search("apple"); // 返回 true
 * trie.search("app"); // 返回 false
 * trie.startsWith("app"); // 返回 true
 * trie.insert("app");
 * trie.search("app"); // 返回 true
 * <p>
 * 说明:
 * <p>
 * 你可以假设所有的输入都是由小写字母 a-z 构成的。
 * 保证所有输入均为非空字符串。
 * @Date 2019-10-14
 * @Version 1.0
 */
public class LeetCode139 {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }

}

class Trie implements Map {
    private Map<String, String> map = new HashMap();

    public void insert(String key) {
        map.put(key, key);
    }

    public boolean search(String key) {
        return map.get(key) == null ? false : true;
    }

    public boolean startsWith(String key) {
        Collection<String> list = map.values();

        for (String s : list) {
            if (s.startsWith(key)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
