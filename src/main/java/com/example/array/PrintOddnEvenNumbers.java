package com.example.array;

import java.util.ArrayList;
import java.util.List;

public class PrintOddnEvenNumbers {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        PrintOddnEvenNumbers obj = new PrintOddnEvenNumbers();
        List<Integer> ans = obj.printEvenNumbers(arr);
        for(int i:ans){
            System.out.print(i);
        }
        System.out.println();

        List<Integer> s = obj.printOddNumbers(arr);
        for(int j:s){
            System.out.print(j);
        }
    }

    public List<Integer> printOddNumbers(int[] arr){
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) {
            temp.add(arr[i]);
            }
        }
        return temp;
    }
    public List<Integer> printEvenNumbers(int[] arr){
        List<Integer> temp2 = new ArrayList<>();
        for(int j =0;j<arr.length;j++){
            if(arr[j]%2!=0){
                temp2.add(arr[j]);
            }
        }
        return temp2;
    }
}
