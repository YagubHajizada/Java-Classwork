package com.rcs.classwork.Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> toDoItem = new ArrayList<>();
        System.out.println("Ievadiet daramo lietu sarakstu: ");
       String userInput = "";
       while (!userInput.equalsIgnoreCase("exit")) {
           userInput = scanner.nextLine();
           if(!userInput.equalsIgnoreCase("exit")) {
               toDoItem.add(userInput);
           }
       }
       scanner.close();

       System.out.printf("Jusu saraksta ir %d lietas: \n",toDoItem.size());
       for(int i = 0; i < toDoItem.size(); i++) {
           System.out.printf("To-Do Item %d: %s \n", i+1, toDoItem.get(i));
       }
    }
}
