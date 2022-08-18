package com.example.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ExctractPortionofArraylist {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abc");
        arr.add("eds");
        arr.add("aas");

        List<String> list = new ArrayList<>();
        list = arr.subList(0,1);
        System.out.println(list);
    }
}
