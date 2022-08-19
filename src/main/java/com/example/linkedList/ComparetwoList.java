package com.example.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ComparetwoList {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("ppp");
        list.add("qaz");
        list.add("asd");
        LinkedList<String> list2  = new LinkedList<>();
        list2.add("ppp");
        list2.add("zzz");

        LinkedList<String> s = new LinkedList<>();
        for(String a : list) {
            s.add(list2.contains(a) ? "yess" : " no");
        }
            System.out.println(s);

    }
}
