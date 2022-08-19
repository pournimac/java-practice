package com.example.linkedList;

import java.util.LinkedList;

public class CheckforEmptylist {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("ppp");
        list.add("qaz");
        list.add("asd");

        list.removeAll(list);
        System.out.println(list.isEmpty());
    }
}
