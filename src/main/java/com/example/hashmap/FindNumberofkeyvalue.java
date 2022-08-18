package com.example.hashmap;

import java.util.HashMap;

public class FindNumberofkeyvalue {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"asd");
        map.put(3,"lkj");
        System.out.println(map.size());
    }
}
