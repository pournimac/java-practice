package com.example.strings;

public class LargestnSmallestWord {
    public static void main(String args[]){
        String str = " India is mya country";
        LargestnSmallestWord obj = new LargestnSmallestWord();
        String s = obj.largestWord(str);
        System.out.println(s);
        String z = obj.smallestWord(str);
        System.out.println(z);
    }

    public String largestWord(String str){
            String[] ans =str.split(" ");
            String longest=" ";
            for (String word:ans){
                if (word.length()>longest.length()) {
                    longest=word;
                }
        }
            return longest;

    }

    public String smallestWord(String str){
        String[] a = str.split(" ");
        String shortest=" ";
        for (String word:a){
            if (word.length()<shortest.length()) {
                shortest=word;

            }
        }
        return shortest;
    }
}
