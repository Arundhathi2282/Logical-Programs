package com.bridgelabz.stopwatch;

import java.util.Scanner;

public class StopWatch {
	static final Scanner SC = new Scanner(System.in);
	long start, stop, elapsedTime;

	public static void main(String[] args) {
		StopWatch object = new StopWatch();
		object.elapsedTime();
	}

	/**
	 * This method will start by taking the system time
	 * 
	 * @return
	 */
	public long startTime() {
		System.out.println("Press s to start");
		char startCharcter = SC.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println(start);
		return start;
	}

	/**
	 * This method will stop by taking the system time
	 * 
	 * @return
	 */
	public long stopTime() {
		System.out.println("Press q to stop");
		char stopCharacter = SC.next().charAt(0);
		stop = System.currentTimeMillis();
		System.out.println(stop);
		return stop;
	}

	/**
	 * This method will give you the elapsed time that is difference between stop
	 * time and start time
	 * 
	 * @return
	 */
	public void elapsedTime() {
		start = startTime();
		stop = stopTime();
		elapsedTime = stop - start;
		System.out.println(elapsedTime);
	}
}
