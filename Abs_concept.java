package com.Javapractice;

public class Abs_concept extends Abstraction_Concept {

	@Override
	public void fbUserName() {
		System.out.println("Manivamrn");
	}

	@Override
	public void fbUserPassword() {
		System.out.println("12454");
	}

	public static void main(String[] args) {
		Abs_concept v = new Abs_concept();
		v.fbUserName();
		v.fbUserPassword();
		v.fbLoginButton();
	}
}
