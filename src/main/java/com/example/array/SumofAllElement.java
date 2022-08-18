package com.example.array;

public class SumofAllElement{
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        SumofAllElement obj = new SumofAllElement();
        int a = obj.sumOfAllElement(arr);
        System.out.println(a);

    }

    public int sumOfAllElement(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
