package com.rcs.classwork.Day10;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numberArray = new int[5];
        Random ran = new Random();
        for(int i = 0; i < numberArray.length; i++) {
            // TODO: Nomainīt uz Random (robežās no 20 līdz 50)
            numberArray[i] = ran.nextInt(31) + 20;
        }
        System.out.println(Arrays.toString(numberArray));
        for(int i = 0; i < numberArray.length / 2; i++) {
            int temp = numberArray[i];
            numberArray[i] = numberArray[numberArray.length - 1 - i];
            numberArray[numberArray.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(numberArray));
            // numberArray[i] <=> numberArray[numberArray.lenght - i - 1]
        }
    }