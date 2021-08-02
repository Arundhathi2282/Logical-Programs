package com.bridgelabz.monthlypayment;

import java.util.Scanner;

public class MonthlyPayment {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Principal Amount : ");
		double P = SC.nextDouble();
		System.out.println("Enter Years : ");
		double Y = SC.nextDouble();
		System.out.println("Enter Percentage : ");
		double R = SC.nextDouble();

		double r = (R / 100) / 12;
		double n = 12 * Y;

		double payment = (P * r) / (1 - Math.pow(1 + r, -n));

		System.out.println("Monthly payments = " + payment);
	}
}
