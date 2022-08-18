package com.example.hashmap;

import java.util.HashMap;

public class CheckSpecifiedKeyValue {
    public static void main(String args[]){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"ponu");
        map.put(2,"duggu");
        map.put(3,"nipun");

        if(map.containsKey(2)){
            System.out.println("map contain this key");
        }else{
            System.out.println("map do not have this key");
        }
        System.out.println();
        if(map.containsValue("nipun")){
            System.out.println("map contains this value");
        }else{
            System.out.println("map does not having this value");
        }

        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
