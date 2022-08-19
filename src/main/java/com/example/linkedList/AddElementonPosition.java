package com.example.linkedList;

import java.util.LinkedList;

public class AddElementonPosition {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("qwe");
        list.add("assd");
        list.add("zxc");

        list.addFirst("aqw");
        list.addLast("cxz");
        list.add(2,"akd");
        System.out.println(list);

        Object a = list.getFirst();
        System.out.println("first :" + a);
        Object b = list.getLast();
        System.out.println("Last :" + b);
    }
}
