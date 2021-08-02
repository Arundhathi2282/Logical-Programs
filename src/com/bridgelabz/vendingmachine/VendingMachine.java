package com.bridgelabz.vendingmachine;

import java.util.Scanner;

public class VendingMachine {
	static final Scanner SC = new Scanner(System.in);
	static int money;

	public static void main(String[] args) {
		System.out.println("Enter money : ");
		money = SC.nextInt();
		VendingMachine object = new VendingMachine();
		if (money >= 1000) {
			object.thousandNotes();
		}
		if (money >= 500) {
			object.fiveHundreadNotes();
		}
		if (money >= 100) {
			object.hundreadNotes();
		}
		if (money >= 50) {
			object.fiftyNotes();
		}
		if (money >= 10) {
			object.tenRsNotes();
		}
		if (money >= 5) {
			object.fiveRsNotes();
		}
		if (money >= 2) {
			object.twoRsNotes();
		}
		if (money >= 1) {
			object.oneRsNotes();
		}
	}

	/**
	 * To get number of 1000rs notes for the given money
	 */
	public void thousandNotes() {
		int a = money / 1000;
		System.out.println("For " + money + "rs you will get " + a + " , 1000rs books");
		money = money - a * 1000;
	}

	/**
	 * To get Number of 500rs notes for the given money
	 */
	public void fiveHundreadNotes() {
		int b = money / 500;
		System.out.println("For " + money + "rs you will get " + b + " , 500rs books");
		money = money - b * 500;
	}

	/**
	 * To get Number of 100rs notes for the given money
	 */
	public void hundreadNotes() {
		int c = money / 100;
		System.out.println("For " + money + "rs you will get " + c + " , 100rs books");
		money = money - c * 100;
	}

	/**
	 * To get Number of 50rs notes for the given money
	 */
	public void fiftyNotes() {
		int d = money / 50;
		System.out.println("For " + money + "rs you will get " + d + " , 50rs books");
		money = money - d * 50;
	}

	/**
	 * To get Number of 10rs notes for the given money
	 */
	public void tenRsNotes() {
		int e = money / 10;
		System.out.println("For " + money + "rs you will get " + e + " , 10rs books");
		money = money - e * 10;
	}

	/**
	 * To get Number of 5rs notes for the given money
	 */
	public void fiveRsNotes() {
		int f = money / 5;
		System.out.println("For " + money + "rs you will get " + f + " , 5rs books");
		money = money - f * 5;
	}

	/**
	 * To get Number of 2rs notes for the given money
	 */
	public void twoRsNotes() {
		int f = money / 2;
		System.out.println("For " + money + "rs you will get " + f + " , 2rs books");
		money = money - f * 2;
	}

	/**
	 * To get Number of 1rs notes for the given money
	 */
	public void oneRsNotes() {
		int f = money / 1;
		System.out.println("For " + money + "rs you will get " + f + " , 1rs books");
		money = money - f * 1;
	}
}
