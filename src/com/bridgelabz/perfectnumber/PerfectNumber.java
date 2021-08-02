package com.bridgelabz.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
	static final Scanner SC = new Scanner(System.in);
	int sum = 0;

	public static void main(String[] args) {
		System.out.print("Enter a Perfect number : ");
		int num = SC.nextInt();
		PerfectNumber object = new PerfectNumber();
		System.out.println(object.perfectNumber(num));
	}

	/**
	 * Checking the an integer is a perfect number or not
	 * 
	 * @param num
	 * @return
	 */
	public String perfectNumber(int num) {
		for (int i = 1; i < num; i++) {
			if ((num % i) == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			return "The number is a Perfect Number";
		} else {
			return "The number is not a Perfect Number";
		}
	}
}
