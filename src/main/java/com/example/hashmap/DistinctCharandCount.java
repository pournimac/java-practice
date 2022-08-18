package com.example.hashmap;

import java.util.HashMap;

public class DistinctCharandCount {
    public static void main(String args[]){
        String str ="abcdeABCDEfghabcehcABC";
        char[] c = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a : c){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        System.out.println(map);
    }
}
