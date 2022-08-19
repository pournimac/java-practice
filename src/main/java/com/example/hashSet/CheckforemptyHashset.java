package com.example.hashSet;

import java.util.HashSet;

public class CheckforemptyHashset {
    public static void main(String args[]){
        HashSet<String> a = new HashSet<>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

        a.removeAll(a);
        System.out.println(a.isEmpty());
    }
}
