package com.day6.assign;

import java.util.Scanner;

public class Fibbonacci {

    public static void main(String[] args) {
        int firstNum = 0;
        int secondNum = 1;
        int n;

        System.out.print("Enter a number of of fibbonacci series to print:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print(firstNum+ " " +secondNum);
        for (int i = 0; i < n-2; i++){


              int sum = firstNum + secondNum;
              firstNum = secondNum;
              secondNum = sum;
            System.out.print(" "+sum);
        }

    }
}
