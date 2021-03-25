package com.rcs.classwork.Day8;

public class WhileLoopOne {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        while (i <= 100) {
            sum += i;
            System.out.println(i++);
        }
        System.out.println("summa:" + sum);
    }
}
