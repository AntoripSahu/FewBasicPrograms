package com.FewBasicPrograms.FibonacciNumbers;

import java.util.Scanner;
import java.util.Arrays;

// A basic example of Dynamic Programming with Memoization
// We get till Fibonacci number #92
public class Fibonacci {
	private static long calcFibonacci(long[] fibo, int n) {

		if(fibo[n]!=0) {
			return fibo[n];
		} else {
			fibo[n] = calcFibonacci(fibo,n - 1) + calcFibonacci(fibo,n - 2);
			return fibo[n];
		}
    }
	public static void main(String args[]) {
		System.out.println("Enter the the value of 'n' for nth Fibonacci number: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Fibonacci number #"+n+" is: ");
		if(n<=0) {
			System.out.println(0);
		} else if(n==1) {
			System.out.println(1);
		} else {
			long[] fibo = new long[n+1];
			Arrays.fill(fibo,0);
			fibo[1] = 1;
			fibo[2] = 1;
			System.out.println(calcFibonacci(fibo,n));
		}
	}
}
