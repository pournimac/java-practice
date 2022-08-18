package com.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class AsociateSpecifiedValuetoKey {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"asd");
        map.put(3,"lkj");
        for(Map.Entry x : map.entrySet()){
            System.out.println(x.getKey()+"="+x.getValue());
        }
    }
}
