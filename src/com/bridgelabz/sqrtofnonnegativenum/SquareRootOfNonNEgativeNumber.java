package com.bridgelabz.sqrtofnonnegativenum;

import java.util.Scanner;

public class SquareRootOfNonNEgativeNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a nonnegative number : ");
		double c = SC.nextDouble();
		double epsilon = 1e-15;
		double t = c;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}
}
