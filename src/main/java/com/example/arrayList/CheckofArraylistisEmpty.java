package com.example.arrayList;

import java.util.ArrayList;

public class CheckofArraylistisEmpty {
    public static void min(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("ab");
        arr.add("sd");
        arr.add("we");
        arr.add("lk");
        arr.add("po");

        arr.clear();
        System.out.println(arr);
        System.out.println(arr.size());
//        if(arr.isEmpty()){
//            System.out.println("empty");
//        }else{
//            System.out.println("not empty");
//        }
    }
}
