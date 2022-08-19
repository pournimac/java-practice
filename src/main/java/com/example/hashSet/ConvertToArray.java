package com.example.hashSet;

import java.util.HashSet;

public class ConvertToArray {
    public static void main(String args[]) {
        HashSet<String> a = new HashSet<>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

        String[] str = new String[a.size()];
        a.toArray(str);
        for (String s : str) {
            System.out.println(s);
        }
    }
}