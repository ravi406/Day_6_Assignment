package com.day6.assign;

import java.util.Scanner;

public class PerfectNumbers {


    public static int perfectNumber(int num){
        int sum=0;
        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Perfect Number :");
        int num=scanner.nextInt();
        sum=perfectNumber(num);

        if (sum == num) {
            System.out.println(num +" is a perfect Number");

        } else {
            System.out.println(num +" is not a perfect Number");
        }

    }
}
