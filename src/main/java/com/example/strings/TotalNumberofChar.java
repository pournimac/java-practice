package com.example.strings;

public class TotalNumberofChar {
    public static void main(String arg[]){
        String str = "aassbdhguicjcbiuc";
        TotalNumberofChar obj = new TotalNumberofChar();
        int s = obj.countNumberofCharecters(str);
        System.out.println(s);
    }

    public int countNumberofCharecters(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ') {
                count++;
            }
        }
        return count;
    }
}
