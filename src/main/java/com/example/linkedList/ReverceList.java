package com.example.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ReverceList {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("qwe");
        list.add("assd");
        list.add("zxc");

        Collections.reverse(list);
        System.out.println(list);
    }
}
