package cmo.bridgelabz.dayofweek;

import java.util.Scanner;

public class DayOfWeek {
	static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter month : ");
		int m = SC.nextInt();
		System.out.println("Enter date : ");
		int d = SC.nextInt();
		System.out.println("Enter year : ");
		int y = SC.nextInt();
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		System.out.println(y0);
		System.out.println(x);
		System.out.println(m0);
		System.out.println(d0);
		switch (d0) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
		}
	}
}
