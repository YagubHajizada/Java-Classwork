package com.rcs.classwork.Day9;

public class AverageGrades {
    public static void main(String[] args) {
        int[] grades = {2, 5, 7, 3, 10, 4, 8, 9};
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
            sum += grades[i];
        }
        float average = sum / grades.length;
        System.out.printf("Average: %.2f",average);
    }
    }