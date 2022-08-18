package com.example.arrayList;

import java.util.ArrayList;

public class CopyOnearraylistToAnother {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abc");
        arr.add("eds");
        arr.add("aas");

        ArrayList<String> array = new ArrayList<>();
        array.add("mmm");
        array.add("ppp");
        array.add("kkk");

        ArrayList<String> s = new ArrayList<>();
        s.addAll(arr);
        System.out.println(s);


    }
}
