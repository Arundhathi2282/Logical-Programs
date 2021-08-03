package com.bridgelabz.couponnumber;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a coupon number : ");
		int randomCoupon;
		int coupon = scanner.nextInt();
		int array[] = new int[coupon];
		int array1[] = new int[coupon];
		Random random = new Random();
		for (int i = 0; i < coupon; i++) {
			randomCoupon = 1 + random.nextInt(coupon);
			array[i] = randomCoupon;
			System.out.println(array[i]);
		}
		int j = 0;
		int temp[] = new int[coupon];
		for (int i = 0; i < coupon - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		System.out.println("\n");
		for (int i = 0; i < coupon; i++) {
			array[i] = temp[i];
			System.out.print(array[i]);
		}
	}
}
