package com.example.hashSet;

import java.util.HashSet;

public class RetainedHashset {
    public static void main(String args[]) {
        HashSet<String> a = new HashSet<>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

            HashSet<String> b = new HashSet<>();
            b.add("qaz");
            b.add("wsx");
            b.add("edca");

        a.retainAll(b);
            System.out.println(a);
    }
}
