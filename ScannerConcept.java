package com.Javapractice;

import java.util.Scanner;

public class ScannerConcept {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Namee, Age ,height, weight, gender, profession");
		// String name = s.nextLine();
		int totnumb = s.nextInt();
		double heighht = s.nextDouble();

		System.out.println("Total no of employees " + totnumb);
		System.out.println("Height is : " + heighht);

	}
}
