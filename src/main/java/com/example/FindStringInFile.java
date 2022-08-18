package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInFile {
    public static Boolean main(String[] args) throws FileNotFoundException {
        String str ="ponu";
        Boolean bol = false;
        File file = new File("C:\\Users\\Nitin\\Desktop");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if(line.contains(str)){
                sc.close();
                return true;
            }
        }
        sc.close();
        return false;
    }
}
