package com.example.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurance {
    public static void main(String[] args) {
        String str = "hi i am nitin hi i am good good night";
        Map<String,Integer> map = countOccurance(str);
        for(String s:map.keySet()){
            System.out.println(s+" => "+map.get(s));
        }
    }

    private static Map<String, Integer> countOccurance(String str) {
        Map<String,Integer> map = new HashMap<>();
        String[] strings =  str.split(" ");
        for(String s: strings){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
        return map;
    }
}
