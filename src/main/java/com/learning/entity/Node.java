package com.learning.entity;

/**
 * @Author xuetao
 * @Description: TODO
 * @Date 2019-05-27
 * @Version 1.0
 */
public class Node<K, V> {
    public int hash;
    public K key;
    public V value;
    public Node next;

    public Node(int hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public final K getKey() {
        return key;
    }

    public final V getValue() {
        return value;
    }

    public final V setValue(V newValue) {
        V oldValue = value;
        value = newValue;
        return oldValue;
    }
}
