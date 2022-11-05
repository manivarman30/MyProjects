package com.javapractice;

public class PolymorpismConcept {
//Method overloading
	public void tester() {
		System.out.println("No parameters");
	}

	public void tester(int q, short s) {
		System.out.println(q);
	}

	public void tester(long l) {
		System.out.println(l);
	}

	public void tester(byte b) {
		System.out.println(b);
	}

	public void tester(char c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		PolymorpismConcept p = new PolymorpismConcept();
		p.tester();
		p.tester(128);
		p.tester('m');
		p.tester(78954622);

	}
}
