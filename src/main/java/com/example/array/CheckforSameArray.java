package com.example.array;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class CheckforSameArray {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 4};

        int l1 = a.length;
        int l2 = b.length;
        Boolean isEqual = false;

        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                for (int j = 0; j < l2; j++) {
                    if (a[i] == b[j]) {
                        isEqual = true;
                    }
                }
            }
        }
        if(isEqual==true){
            System.out.println("Both arrays are equal");
        }else{
            System.out.println("Both arrays are not equal");
        }
    }
}
