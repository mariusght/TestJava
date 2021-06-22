package com.company;

import java.util.Scanner;

public class SumProductMinMax {
    public static void main (String[] args){
        Scanner ipt = new Scanner(System.in);
        System.out.println("Enter 1st nr- ");
        int A = ipt.nextInt();
        System.out.println("Enter 2nd nr- ");
        int B = ipt.nextInt();
        System.out.println("Enter 3rd nr- ");
        int C = ipt.nextInt();
        int SUM = A+B+C;
        System.out.println(SUM);
        int PRO = A*B*C;
        System.out.println(PRO);
    }
}

