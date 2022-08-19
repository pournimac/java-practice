package com.example.hashSet;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertTOTreeSet {
    public static void main(String args[]) {
        HashSet<String> a = new HashSet<>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

        Set<String> s = new TreeSet<>(a);
        System.out.println(s);
    }
}
