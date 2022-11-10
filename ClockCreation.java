package com.Javapractice;

public class ClockCreation {

	public int seconds;
	public int minutes;
	public int hours;

	public ClockCreation(int initialHour, int initialMinutes, int initialSeconds) {
		initialSeconds = 0;
		initialMinutes = 0;
		initialHour = 0;

	}

	public void Tick() {
		seconds = seconds++;
		if (seconds == 60) {
			minutes++;
			seconds = 0;
			if (minutes == 60) {
				hours++;
				minutes = 0;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println();
	}
}
