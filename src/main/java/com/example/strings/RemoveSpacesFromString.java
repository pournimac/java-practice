package com.example.strings;

public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "if sfk  fakj   sajkjk fsjkkf     sakj";
        System.out.println(removeSpaces(str));
        System.out.println(removeSpaces1(str));
    }

    private static String removeSpaces(String str) {
        return str.replaceAll("\\s","");
    }

    private static String removeSpaces1(String str){
        StringBuilder s = new StringBuilder();
        for(char c : str.toCharArray()){
            if(c != ' '){
                s.append(c);
            }
        }
        return s.toString();
    }
}
