package com.example.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertintArraylist {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        System.out.println(list);

        System.out.println();
        List<String> l1 = new ArrayList<>();
        l1.addAll(list);
        System.out.println(l1);
    }
}
