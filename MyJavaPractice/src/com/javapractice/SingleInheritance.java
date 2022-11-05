package com.javapractice;

public class SingleInheritance extends SimpleProgram {
//Parent class
	public void schdetails() {
		System.out.println("St.marys");
	}

	public void clgdetails() {
		System.out.println("123456789");
	}

	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.schdetails();
		s.clgdetails();
		s.userName();
		s.userNumber();
	}
}
