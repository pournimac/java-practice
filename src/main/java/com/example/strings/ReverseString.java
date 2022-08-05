package com.example.strings;

/**
 * Given a string, reverse it and return it from a function.
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "I love India";
        System.out.println(reverseString(str));
        System.out.println(reverseString1(str));
    }

    private static String reverseString(String str) {
        char[] arr = str.toCharArray();
        for(int i=0;i<arr.length/2;i++){
            char c = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = c;
        }
        return new String(arr);
    }
    private static String reverseString1(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
