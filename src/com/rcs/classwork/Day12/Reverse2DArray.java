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
        System.out.println();
        for (int i = 0; i < array2D[0].length; i++) {
            int t = array2D[0][i];
            array2D[0][i] = array2D[array2D.length - 1][i];
            array2D[array2D.length - 1][i] = t;
        }
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++)
                System.out.printf("%5d", array2D[i][j]);
            System.out.println();
        }
    }
}
