package com.company;

import java.util.Scanner;

public class PracticeCode {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}

    /*



    //for
        int[] numbers = {1,2,3,5,6,44};
        for (int i = 6; i < numbers.length; i++) {
            System.out.println("value :: " + numbers[i]);
        }

    //while
            int i = 0;
        while (i < 5) {
            System.out.println("value :: " + i);
            i++;
        }



    //SWITCH
            char grade = '$';
        switch (grade){
            case 'A':
                System.out.println("excellent!!!");
                break;
            case 'B':
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("you passed");
            case 'F':
                System.out.println("try again");
                break;
            default:
                System.out.println("invalid");
        }

      // nested if
        Double n1 = -1.0, n2 = -4.5, n3 = -5.3, largestNumber;
        if (n1 >= n2){
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            }else {
                largestNumber = n3;
            }
        }


      int number = 0;
    if (number > 0) {
        System.out.println("number is positive");
    } else if (number < 0) {
        System.out.println("number is neggative");
    } else {
        System.out.println("number is 0.");
    }


  int n1 = 98;
    int n2 = 5;
    int sum, difference, product, quotient, remainder;

    sum = n1 + n2;
    difference = n1 - n2;
    product = n1 * n2;
    quotient = n1 / n2;
    remainder = n1 % n2;
    //++n1;
    //++n2;
    quotient = n1+n2;

    n1 -= 110; // same as n1 = n1 - 110
        System.out.println(n1);



   increment and decrement exercises
   int i = 5;
   int j = ++i;
   i++ = post increment > firs you assign to j value of 'i', then you increment 'i' with
            ++i = pre increment
    System.out.println(j + " : " + i); // this should print 5 for j and 6 for i
        int i = 3;
        i = i++;
        System.out.println(i);  // it will still print '3' */

