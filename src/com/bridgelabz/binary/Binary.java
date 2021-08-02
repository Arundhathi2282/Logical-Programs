package com.bridgelabz.binary;

import java.util.Scanner;

public class Binary {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a decimal : ");
		int decimal = SC.nextInt();
		System.out.println(swapNibbles(decimal));

	}

	public static int swapNibbles(int decimal) {
		return ((decimal & 0x0F) << 4 | (decimal & 0xF0) >> 4);
	}
}
