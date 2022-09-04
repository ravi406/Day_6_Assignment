package com.day6.assign;

import java.util.Scanner;

public class PrimeNumbers {

    public static boolean isPrime(int n){
        if (n <= 1)
            return false;

        for (int i = 2; i <= n/2; i++){
             if (n % i == 0)
                 return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check Prime or Not");
        int n = sc.nextInt();

        if (isPrime(n))
                System.out.println(n+": is a Prime Number ");
        else
                System.out.println(n +": is Not a Prime Number");


    }
}
