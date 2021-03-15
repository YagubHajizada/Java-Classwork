package com.rcs.classwork.Day12;

import java.util.Random;

public class Reverse2DArray {
    public static void main(String[] args) {
        Random ran = new Random();
        int n = ran.nextInt(5) + 2;
        int m = ran.nextInt(5) + 3;
        int[][] array2D = new int[n][m];
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                array2D[i][j] = ran.nextInt(101);
                System.out.printf("%5d", array2D[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array2D.length / 2; i++) {
            int oppositeIndex = array2D.length - 1 -i;
            int[] temp = array2D[i];
            array2D[i] = array2D[oppositeIndex];
            array2D[oppositeIndex] = temp;
        }
        System.out.println();

        for (int[] i : array2D) {
            for (int j : i) {
                System.out.printf("%4d ", j);
            }
            System.out.println();
        }
    }
}
