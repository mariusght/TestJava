package com.company;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {

        //1. Write a Java program to sort a numeric array and a string array. Check and use available Arrays methods.
        int [] arrayDeNumere = {2, 33, 444, 5555, 7, 66, 55};

        String [] arrayDeStrings = {"nume", "lista", "test", "girafa", "mousePad"};

        System.out.println("initial order: " + Arrays.toString(arrayDeNumere));
        Arrays.sort(arrayDeNumere);
        System.out.println("now sorted: " + Arrays.toString(arrayDeNumere));

        System.out.println("initial order: " + Arrays.toString(arrayDeStrings));
        Arrays.sort(arrayDeStrings);
        System.out.println("after sort: " + Arrays.toString(arrayDeStrings));

        // 2. Write a Java program to find the common elements between two arrays (string values). Use two for loops to cover every element in the arrays.

        int [] firstArrayOfNumbers  = {1, 14, 32, 22, 51, 153};
        int [] secondArrayOfNumbers = {1, 31, 32, 152, 153, 211};

        System.out.println("firstArrayOfNumbers: " + Arrays.toString(firstArrayOfNumbers));
        System.out.println("secondArrayOfNumbers: " + Arrays.toString(secondArrayOfNumbers));

        for (int i = 0; i < firstArrayOfNumbers.length; i++) {
            for (int j = 0; j < secondArrayOfNumbers.length; j++) {
                if (firstArrayOfNumbers[i] == (secondArrayOfNumbers[j])) {

                    System.out.println("the common element is: " + (firstArrayOfNumbers[i]));
                }
            }
        }

        //3. Write a Java program to convert an array to ArrayList
        String[] arrayOfAnimals = new String[] {"python", "lion", "monkey"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrayOfAnimals));
        System.out.println(list);



    }
}
