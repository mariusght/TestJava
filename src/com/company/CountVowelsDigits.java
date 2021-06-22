package com.company;

public class CountVowelsDigits {
    public static void main(String[] args) {
        int vocale = 0;
        int digits = 0;

        String str = "here i have a string to check the 12 vowels";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vocale++;
            }if (str.charAt(i) == '1' || str.charAt(i) == '2') {
                digits++;
            }
        }
        System.out.println("the string contains " + vocale + " vowels and " + digits + " digits");
    }
}




