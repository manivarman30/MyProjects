package com.Javapractice;

public class StaticBlock {
	// Static block -->{}
	static {
		System.out.println("First static block");
	}
	static {
		System.out.println("second static block");
	}

	public static void main(String[] args) {
		System.out.println("main method bloc");
	}
}