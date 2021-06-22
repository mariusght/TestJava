package com.company;

import java.util.Scanner;

public class PositiveInt {
    public static void main(String[] args) {
        int n, reverse = 0;

        System.out.println("hello, enter a 2 digit number: ");
        Scanner userInput = new Scanner(System.in);
        n = userInput.nextInt();

        while(n != 0)
        {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
            System.out.println(reverse);
            System.out.println(n);
        }

        System.out.println("reverse= " + reverse);
    }
    }
