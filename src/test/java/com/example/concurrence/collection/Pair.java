package com.example.concurrence.collection;

/**
 * Created by cuiyy on 2017/12/20.
 */
public class Pair<K, V> {
    public final K key;
    public final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
