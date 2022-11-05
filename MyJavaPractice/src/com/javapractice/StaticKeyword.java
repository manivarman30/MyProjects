package com.javapractice;

public class StaticKeyword {
//Static method
	public static void staticMethod() {
		System.out.println("This is static");
	}

	public void nonStaticMethod() {

		System.out.println("This is Non-static");
	}

	public static void main(String[] args) {
		staticMethod();

		StaticKeyword k = new StaticKeyword();
		k.nonStaticMethod();
	}
}
