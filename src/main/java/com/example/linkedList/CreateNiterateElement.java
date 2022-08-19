package com.example.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class CreateNiterateElement {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<>();
        list.add("qwe");
        list.add("assd");
        list.add("zxc");

        for(String s : list){
            System.out.println(s);
        }
        System.out.println();
        Iterator it = list.listIterator(1);
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
