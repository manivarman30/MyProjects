package com.javapractice;

public class StringMethods {

	public static void main(String[] args) {
		String name = "Sachintendulkar";

		System.out.println(name.charAt(5));
		System.out.println(name.concat("Ramesh"));
		System.out.println(name.contains("sachintendulkar")); // boolean
		System.out.println(name.equals("sachintendulkar"));
		System.out.println(name.equalsIgnoreCase("SacHINTenDULkAR"));
		System.out.println(name.indent(8));
		System.out.println(name.indexOf("n"));
		System.out.println(name.length());
		System.out.println(name.trim());

		String isblankk = "";
		System.out.println(isblankk.isBlank());
		String isemptyyy = " ";
		System.out.println(isemptyyy.isEmpty());

		System.out.println(name.replace("Sachin", "manof"));
		System.out.println(name.substring(5));

	}

}
