package com.example.array;

import java.util.Arrays;

public class SortElement {
    public static void main(String args[]){
        //int[] arr = {12,4,3,8,6,3,1};
        char[] arr = {'c','s','d','a','t'};
        SortElement obj = new SortElement();
        //int[] ans = obj.sortNumber(arr);
        char[] ans = obj.sortCharecters(arr);
        for(char i : ans){
            System.out.println(i);
        }
    }

    public int[] sortNumber(int[] arr){
       // int[] temp = new int[arr.length];
        Arrays.sort(arr);
        return arr;
    }

    public char[] sortCharecters(char[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
