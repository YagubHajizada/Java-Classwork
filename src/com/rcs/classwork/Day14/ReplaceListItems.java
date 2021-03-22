package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReplaceListItems {
    public static void main(String[] args) {
        Random ran = new Random();
        List<Integer> numberList = new ArrayList<>();
        int N = ran.nextInt(16) + 5;

        for (int i = 0; i < N; i++) {
            numberList.add(ran.nextInt(101));
            if (numberList.get(i) <= 39) {
                numberList.set(i, 0);
            }
            System.out.printf("%2d", numberList.get(i));
            if ( i != N) {
                System.out.print("; ");
            } else {
                System.out.println();
        }
    }
    }
}