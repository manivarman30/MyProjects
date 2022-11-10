package com.Javapractice;

public class Polymorphsm_Overriding extends PolymorpismConcept {
	// Method different

	public void fbUser() {
		System.out.println("sinn");
	}

	public void fbPass() {
		System.out.println("56565");
	}

	@Override // Annotation
	public void tester(long l) {
		System.out.println(l);
	}

	public static void main(String[] args) {
		Polymorphsm_Overriding a = new Polymorphsm_Overriding();
		a.fbUser();
		a.fbPass();
		a.tester(123456789);
	}
}
