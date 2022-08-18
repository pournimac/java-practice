package com.example.arrayList;

import java.util.ArrayList;

public class ReplaceElementwithSpecifiedEle{
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ab");
        arr.add("sd");
        arr.add("we");
        arr.add("lk");
        arr.add("po");

        String s = "lp";
        arr.set(2,s);
        System.out.println(arr);
    }
}
