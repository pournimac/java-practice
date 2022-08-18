package com.example.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreatandPrintarraylist {
    public static void main(String args[]){
        ArrayList<String> array = new ArrayList<>();
        array.add("pink");
        array.add("yellow");
        array.add("black");
        array.add(1,"white");

        //System.out.println(array);
        for(String s : array){
            System.out.println(s);
        }

        for(int i=0; i< array.size();i++){
            System.out.println(array.get(2));
            break;
        }
        System.out.println();
       // array.remove(3);
       // System.out.println(array);

        System.out.println();
        if(array.contains("white")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        Collections.sort(array);
        System.out.println(array);
    }
}
