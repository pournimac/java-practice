package com.example.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConverttoList {
    public static void main(String args[]) {
        HashSet<String> a = new HashSet<String>();
        a.add("qaz");
        a.add("wsx");
        a.add("edc");

        List<String> s = new ArrayList<String>(a);
        System.out.println(s);
    }
}
