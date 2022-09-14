package com.day6.assign;

import java.util.Scanner;

public class ReverseNumber {

    public static void reverseNumber(int num) { //123
        int reverse = 0;
        int remainder;

        int num1 = num;

        while (num1 != 0) {
            remainder = num1 % 10;
            reverse = reverse * 10 + remainder;
            num1 = num1 / 10;
        }
        System.out.println("Reversed Number obtained is :" +reverse);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse");
        int num=scanner.nextInt();
        reverseNumber(num);



    }

}
