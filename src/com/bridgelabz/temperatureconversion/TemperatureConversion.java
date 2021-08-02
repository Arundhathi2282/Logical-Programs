package com.bridgelabz.temperatureconversion;

import java.util.Scanner;

public class TemperatureConversion {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter temperature in Fahrenheit : ");
		int F = SC.nextInt();
		double C = (F - 32) * 5 / 9;
		System.out.println("Fahrenheit in celsius : " + C);
		System.out.println("Enter temperature in Celsius : ");
		int C1 = SC.nextInt();
		double F1 = (C1 * 9 / 5) + 32;
		System.out.println("Celsius in Fahrenheit : " + F1);
	}
}
