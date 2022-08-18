package com.example.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwaptoElement {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ab");
        arr.add("sd");
        arr.add("we");
        arr.add("lk");
        arr.add("po");

        for(String s : arr){
            Collections.swap(arr,1,3);
        }
        for(String a : arr){
            System.out.println(a);
        }
    }
}
