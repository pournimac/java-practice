package com.example.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverceElement {
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("abc");
        arr.add("eds");
        arr.add("aas");

        Collections.reverse(arr);
        System.out.println(arr);
    }
}
