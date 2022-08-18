package com.example.list;

import java.util.ArrayList;
import java.util.List;

public class MargeTwoList {
    public static void main(String args[]){
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(5);
        l2.add(6);

        List<Integer> mergelist = new ArrayList<>(l1);
        mergelist.addAll(l2);
        System.out.println(mergelist);

        List<String> a = new ArrayList<>();
        a.add("abc");
        List<String> b = new ArrayList<>();
        b.add("def");

        List<String> m = new ArrayList<>(a);
        m.addAll(b);
        System.out.println(m);

    }
}
