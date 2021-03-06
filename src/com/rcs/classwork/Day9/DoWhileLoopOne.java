package com.rcs.classwork.Day9;

public class DoWhileLoopOne {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        do {
            System.out.println("summa:" + sum);
            i++;
            sum += i;
        } while (i <= 10);
    }
}
