package com.example.array;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BubbleSort {
    public static void main(String args[]){
        int[] arr = { 2,5,6,3,3,1,7,4,9};
        BubbleSort obj = new BubbleSort();
        int[] ans = obj.bubbleSort(arr);
        for(int i: ans){
            System.out.println(i);
        }
    }

    public int[] bubbleSort(int[] arr){
        //int[] sort = new int[arr.length];
        int i=0;
        Collection<Integer> c = new LinkedHashSet<>();
        c.add(arr[i]);
        i++;
        return arr;
    }
}
