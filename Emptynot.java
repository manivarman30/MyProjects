package com.Javapractice;

public class Emptynot extends Empty {

	public void run() {
		System.out.println("THRED IS RUNNING");
	}

	public static void main(String[] args) {
		Emptynot e = new Emptynot();
		e.start();
	}
}
