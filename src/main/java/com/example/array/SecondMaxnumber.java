package com.example.array;

public class SecondMaxnumber {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,10,2,3};
        SecondMaxnumber obj = new SecondMaxnumber();
        int ans = obj.maxNumber(arr);
        System.out.println(ans);
    }

    public int maxNumber(int[] arr){
        int max = arr[0];
        int temp = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                temp = max;
            }else if(temp<arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
