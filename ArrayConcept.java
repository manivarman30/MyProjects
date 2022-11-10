package com.Javapractice;

public class ArrayConcept {

	public static void main(String[] args) {
		String[] a = new String[5]; // --> Array creation
		a[0] = "Captain america";
		a[1] = "Ironman";
		a[2] = "Trevor";
		a[3] = "Michael";
		a[4] = "Franklin";
		// a[5] = 60;

		System.out.println(a[3].charAt(0));

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
