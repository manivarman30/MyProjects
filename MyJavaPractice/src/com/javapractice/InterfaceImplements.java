package com.javapractice;

public class InterfaceImplements implements Interface_Abs1, Interface_Abs2 {

	@Override
	public void time() {
		System.out.println("TIme");
	}

	@Override
	public void seconds() {
		System.out.println("seconds");

	}

	@Override
	public void minutes() {
		System.out.println("minutes");
	}

	@Override
	public void fastrack() {
		System.out.println("fastrack");
	}

	@Override
	public void rolex() {
		System.out.println("rolex");
	}

	public static void main(String[] args) {
		InterfaceImplements c = new InterfaceImplements();
		c.time();
		c.seconds();
		c.fastrack();
		c.minutes();
		c.rolex();
		c.amazon();
		c.flipkart();
		c.jiomart();
		c.meesho();
	}

	@Override
	public void amazon() {
		System.out.println("Amazon login");
	}

	@Override
	public void flipkart() {
		System.out.println("flipkart login");
	}

	@Override
	public void meesho() {
		System.out.println("meesho login");
	}

	@Override
	public void jiomart() {
		System.out.println("jiomart login");
	}
}
