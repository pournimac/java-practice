package com.example.array;

public class MaxNumber {
    public static void main(String args[]){
        int[] arr = {1,3,5,6,7,12};
        MaxNumber obj = new MaxNumber();
       int a = obj.maxNumber(arr);
        System.out.println(a);

    }

    public int maxNumber(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
