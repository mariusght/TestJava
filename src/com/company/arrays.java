package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        //4.Write a Java program to iterate through all elements in a array list and print them.
        List<String> rainbowColors = new ArrayList<String>();
        rainbowColors.add("red");
        rainbowColors.add("green");
        rainbowColors.add("orange");
        rainbowColors.add("yellow");
        rainbowColors.add("purple");

        for (String element: rainbowColors) {
            System.out.println(element);
        }

        //5. Write a Java program to reverse elements in a array list. Check available methods in Collections class.
        System.out.println("using list from exercise 4: " + rainbowColors);
        Collections.reverse(rainbowColors);
        System.out.println("rainbowColors after using reverse is: " + rainbowColors);

        //6. Write a Java program to empty an array list and write another program to test if the array list is empty.
        ArrayList<String> bears = new ArrayList<String>();
        bears.add("brownBear");
        bears.add("polarBear");
        bears.add("grizzlyBear");
        System.out.println("list before using remove all: " + bears);
        bears.removeAll(bears);
        System.out.println(bears);

        //7. First, generate 10 1-100 random numbers, then put them in an array. Put the numbers from the array greater than or equal to 10 into a list collection and print them to the console.
        int[] tenRandomNumbers = new int[10];
        for(int i = 0; i < tenRandomNumbers.length; i++) {
            tenRandomNumbers[i] = (int)(Math.random()*20 + 1);
        }
        System.out.println("store in an Array: " + Arrays.toString(tenRandomNumbers));

        //8. Write a application that allows the user to enter up to 20 integer grades into an array. Stop the loop by typing in ‐1.
        // Your main method should call an Average method that returns the average of the grades. Use the DecimalFormat class to format the average to 2 decimal places.
    }
}
