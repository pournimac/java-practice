package com.example.array;

import java.lang.reflect.Array;

public class RemoveSpecificElement {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int index = 4;
        RemoveSpecificElement obj = new RemoveSpecificElement();
        int[] ans = obj.removerSpecificInteger(arr, index);

    }


    public static int[] removerSpecificInteger(int[] arr,int index){
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }
        int[] a = new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(i==index){
                continue;
            }
           for(int j=0;j<a.length;j++){
               a[j]=arr[i];
           }
        }
        return a;
    }
}
