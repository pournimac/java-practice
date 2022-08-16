package com.example.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDouplicates {

    public static void main(String args[]){
        //int[] arr = {1,2,3,3,3,2,4,5,6,4};
        //char[] arr = {'a','s','r','d','a','s','u','u','q'};
        String[] arr = {"ppp","bbb","aaa","ppp","aaa"};
        RemoveDouplicates obj = new RemoveDouplicates();
        //int[] ans = obj.removeDuplicateNumber(arr);
        //char[] ans = obj.removeDuplicateCharecter(arr);
        String[] ans = obj.removeDuplicateString(arr);
        for(String i : ans){
            System.out.println(i);
        }
    }

    public int[] removeDuplicateNumber(int[] arr){

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i: arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            }
        }
        int j=0;
        int[] temp = new int[map.keySet().size()];
        for(int n: map.keySet()){
            temp[j]=n;
            j++;
        }
        return temp;

    }

    public char[] removeDuplicateCharecter(char[] arr){
        char[] temp = new char[arr.length];
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c: arr){
            if(!(map.containsKey(c))){
                map.put(c,1);
            }
        }
        int k =0;
        char[] chararr = new char[map.keySet().size()];
        for(char a : map.keySet()){
            chararr[k] = a;
            k++;
        }
        return chararr;
    }

    public String[] removeDuplicateString(String[] array){
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s:array){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
        }
        int q = 0;
        String[] str = new String[map.keySet().size()];
        for(String s:map.keySet()){
            str[q] = s;
            q++;
        }
        return str;
    }
}
