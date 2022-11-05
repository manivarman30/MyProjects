package com.javapractice;

public class StringBuffer_Builder {

	public static void main(String[] args) {
		System.out.println("String is Immutable");
		String a = "Cricketer";
		System.out.println("Appending : " + a.concat("Sachin"));
		System.out.println("org a :" + a);

		System.out.println("Stringbuffer is mutable");
		StringBuffer name = new StringBuffer("keerthana");
		System.out.println("Appending : " + name.append("Keerth"));
		System.out.println("Org name : " + name);

		StringBuffer u = new StringBuffer("Nishanthi");
		System.out.println("Reversed name :" + u.reverse());
		StringBuffer Test = new StringBuffer("Dhoni");
		System.out.println(Test.delete(0, 3));

		StringBuilder up = new StringBuilder("Mike tyson");
		System.out.println(up.capacity());

	}

}
