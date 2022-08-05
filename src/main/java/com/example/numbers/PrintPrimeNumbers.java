package com.example.numbers;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primes = printPrimeNumbers(100);
        primes.forEach(System.out::println);
    }

    private static List<Integer> printPrimeNumbers(int num) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i < num; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(i);
        }
        return list;
    }
}
