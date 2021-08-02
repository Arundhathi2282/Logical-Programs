package com.bridgelabz.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
	static final Scanner SC = new Scanner(System.in);
	int number1 = 0, number2 = 1, number3;

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int N = SC.nextInt();
		FibonacciSeries object = new FibonacciSeries();
		object.fibonacci(N);
	}

	/**
	 * Printing the Fibonacci series
	 * 
	 * @param N
	 */
	public void fibonacci(int N) {
		System.out.print("Fibonacci series is : ");
		System.out.print("0, 1, ");
		for (int i = 2; i < N; i++) {
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			System.out.print(number3);
			if (i < N - 1)
				System.out.print(", ");
		}
	}
}
