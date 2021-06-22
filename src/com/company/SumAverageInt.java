package com.company;

public class SumAverageInt {
    public static void main(String[] args) {
        int num = 100, sum = 0;
        double averageOfNum;
        for (int i = 1; i <= num; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        averageOfNum = sum / 100;
        System.out.println("The average value is " + averageOfNum);

    }
}
