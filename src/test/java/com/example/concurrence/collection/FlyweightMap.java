package com.example.concurrence.collection;

import java.util.AbstractList;

/**
 * Created by cuiyy on 2017/12/21.
 */

public class FlyweightMap extends AbstractList<Integer> {
    private int size;

    public FlyweightMap(int size) {
        this.size = size < 0 ? 0 : size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new FlyweightMap(30));
    }
}


