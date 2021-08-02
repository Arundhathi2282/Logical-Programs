package com.bridgelabz.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	static final Scanner SC = new Scanner(System.in);
	int flag = 0;

	public static void main(String[] args) {
		System.out.println("Enter a number  : ");
		int number = SC.nextInt();
		PrimeNumber object = new PrimeNumber();
		System.out.println(object.numberIsPrimeOrNot(number));
	}

	/**
	 * To check given number is prime or not
	 * 
	 * @param number
	 * @return
	 */
	public String numberIsPrimeOrNot(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = 1;
			} else {
				flag = 0;
			}
		}
		if (flag == 0) {
			return "Prime Number";
		} else {
			return "Not a prime Number";
		}
	}
}
