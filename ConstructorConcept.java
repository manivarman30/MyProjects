package com.Javapractice;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("hello");
	}

	public ConstructorConcept(int i) {
		System.out.println(i);
	}

	public ConstructorConcept(short s) {
		System.out.println(s);
	}
	public ConstructorConcept(long a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		ConstructorConcept t = new ConstructorConcept();
		ConstructorConcept w = new ConstructorConcept(564);
		ConstructorConcept r = new ConstructorConcept(25486);
		ConstructorConcept t1 = new ConstructorConcept(888888888);
			
	}
}
