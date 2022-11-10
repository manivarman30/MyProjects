package com.Javapractice;

public class StaticVariable {

	static int actBalance = 0;

	java.lang.String depositedBy;

	public static void main(String[] args) {

		StaticVariable ob = new StaticVariable();
		StaticVariable.actBalance = 1000;
		ob.depositedBy = "Jay";

		StaticVariable bo = new StaticVariable();
		bo.actBalance = 3000;
		bo.depositedBy = "ram";

		System.out.println("ob1 Integer: " + ob.actBalance);
		System.out.println("ob1 String: " + ob.depositedBy);
		System.out.println("ob2 Integer: " + bo.actBalance);
		System.out.println("ob2 String: " + bo.depositedBy);
	}

}
