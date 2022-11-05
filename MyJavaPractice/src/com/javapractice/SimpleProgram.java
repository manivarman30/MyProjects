package com.javapractice; // ------> Package

public class SimpleProgram { // ------> Class
//Grandparent class
	public void userName() { // --------> method
		System.out.println("Welcome to greens"); // -------> Implementation part
	}

	public void userNumber() { // --------> method
		System.out.println("14566626");
	}

	public static void main(String[] args) { // -------->Main method
		// ClassName objectname = new ClassName(); // --> Object creation
		SimpleProgram o = new SimpleProgram(); // ----> Object creation
		o.userName();
		o.userNumber();
	}

}