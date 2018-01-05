package com.example.concurrence.collection.list;

import com.example.concurrence.collection.Countries;

import java.util.*;

/**
 * Created by cuiyy on 2017/12/22.
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1, "x");
        a.add("x");
        String it = a.iterator().next();
        System.out.println("iterator :" + it);

    }
}

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        Lists.basicTest(list);

    ListIterator<String>x=list.listIterator();

    }
}
