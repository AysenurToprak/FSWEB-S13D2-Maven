package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)){
            System.out.println(number + " mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }

        if (isPalindrome(number)){
            System.out.println(number + " mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " mükemmel bir sayı değildir.");
        }
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0 ;
        for(int i = 1 ; i<=number/2;i++){
            if (number % i == 0){
                sum +=i;
            }
        }
        return  sum == number;
    }

    public  static  boolean isPalindrome(int number){
        int originalNumber = number;
        int reservedNumber = 0;
        int remainder;
        while (number !=0){
            remainder = number % 10;
            reservedNumber = reservedNumber *10+remainder;
            number = number/10;
        }
        return  originalNumber == reservedNumber;
    }
    public static short numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return 0;
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (number == 0) {
            System.out.println("Zero");
            return 0;
        }

        String result = "";
        while (number > 0) {
            result = words[number % 10] + " " + result;
            number /= 10;
        }

        System.out.println(result.trim());
        return 0;
    }
}




