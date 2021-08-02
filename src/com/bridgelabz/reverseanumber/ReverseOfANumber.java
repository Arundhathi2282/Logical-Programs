package com.bridgelabz.reverseanumber;

import java.util.Scanner;

public class ReverseOfANumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		int reverse = 0;
		System.out.println("Enter a number that you want to reverse : ");
		int number = SC.nextInt();
		while (number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse of the given number is : " + reverse);
	}
}
