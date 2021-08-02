package com.bridgelabz.tobinary;

import java.util.Scanner;

public class ToBinary {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int number = SC.nextInt();
		System.out.println(Integer.toBinaryString(number));
	}
}
