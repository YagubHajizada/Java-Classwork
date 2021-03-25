package com.rcs.classwork.Day15;

import java.util.Arrays;
import java.util.Random;

public class ArrayAverage {
    public static int[] createArray(int S, int A){
        int[] array = new int[S];
        Random rnd = new Random();

        for (int i=0; i < array.length; i++){
            array[i] = rnd.nextInt(A) + 1;
        }
        return array;
    }
    public static float getAverage(int[] array) {
        int sum = 0;
        for (int a : array) {
            sum += a;
        }
        return (float)sum / array.length;
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int S = rnd.nextInt(6) + 5;
        int A = rnd.nextInt(101);
        int[] numberArray = createArray(S, A);
        System.out.println(Arrays.toString(numberArray));
        System.out.println("Array Average: ");
        System.out.println(getAverage(numberArray));
    }
}