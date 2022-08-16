package com.example.strings;

public class ReverceWordinSentance {
    public static void main(String args[]){
        String str = "i am proud to be an Indian";
        ReverceWordinSentance obj = new ReverceWordinSentance();
        String s = obj.reverceWords(str);
        System.out.println(s);
    }

    public String reverceWords(String str){
        String temp = "";
        for(int i=str.length();i>0;--i){
            temp = temp+str.charAt(i-1);
        }
        return temp;
    }
}
