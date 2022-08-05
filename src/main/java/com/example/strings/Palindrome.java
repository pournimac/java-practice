package com.example.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "WhirlPool";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome1(str));
    }

    private static boolean checkPalindrome1(String str) {
        String rev = new StringBuilder(str).reverse().toString();
        return rev.equalsIgnoreCase(str);
    }

    private static boolean checkPalindrome(String str) {
        boolean isPalin = true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalin = false;
                break;
            }
        }
        return isPalin;
    }
}
