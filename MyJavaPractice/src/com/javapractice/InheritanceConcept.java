package com.javapractice;

public class InheritanceConcept extends SingleInheritance {
//Child class
	public void empName() {
		System.out.println("ravi");
	}

	public void empAccountNumber() {
		System.out.println("785496210");
	}

	public static void main(String[] args) {
		InheritanceConcept p = new InheritanceConcept();
		p.empName();
		p.empAccountNumber();
		p.schdetails();
		p.clgdetails();
		p.userName();
		p.empAccountNumber();
	}
}
