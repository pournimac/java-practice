package com.example.hashmap;

import java.util.HashMap;

public class CopyOnemaptoAnothermap {
    public static <Hashmap> void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"asd");
        map.put(3,"lkj");
        HashMap<Integer,String> map1 = new HashMap<>();
//        map1.put(4,"abc");
//        map1.put(5,"asd");
//        map1.put(6,"lkj");
//        map1.putAll(map);
//        System.out.println(map1);
//        map1.clear();
//        System.out.println(map1);
//        Boolean result = map1.isEmpty();
//        System.out.println(result);
        map1 = (HashMap<Integer, String>) map.clone();
        System.out.println(map1);

    }



}
