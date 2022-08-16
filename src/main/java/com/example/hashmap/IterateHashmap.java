package com.example.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashmap {
    public static void main(String agrs[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"ponu");
        map.put(2,"Nipun");
        map.put(3,"Nitin");
        map.put(4,"duggu");

        Iterator it = map.entrySet().iterator();
            //using while loop
        while(it.hasNext()){
            Map.Entry me = (Map.Entry) it.next();
            System.out.println("key is : "+ me.getKey() +" "+"Value is : "+me.getValue());
        }
            //Using for loop
        for(Map.Entry m : map.entrySet()){
            System.out.println("key is : "+ m.getKey() +" "+ "Value is : "+m.getValue());
        }
    }
}
