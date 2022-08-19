package com.example.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class AppendElemntinLast {
    public static void main(String args[]){
        HashSet<String> a = new HashSet<>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

        System.out.println(a);

        Iterator it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(a.size());
    }
}
