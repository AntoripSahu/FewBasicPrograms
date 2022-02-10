package com.FewBasicPrograms.FibonacciNumbers;

import java.util.*;

// A basic example of Dynamic Programming using bottom-up technique
// to calculate the last digit of nth Fibonacci number
public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if(n==1 || n==2) {
            return 1;
        }
        int[] fibo_bu = new int[n+1];
        fibo_bu[1] = fibo_bu[2] = 1;
        for(int i = 3; i <= n; i++) {
            fibo_bu[i] = (fibo_bu[i-1]+fibo_bu[i-2])%10;
        }
        return fibo_bu[n];
    }
    public static void main(String[] args) {
		System.out.println("Enter the the value of 'n' for last digit of nth Fibonacci number: ");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The last digit of Fibonacci number #"+n+" is: ");
        System.out.println(getFibonacciLastDigit(n));
    }
}

