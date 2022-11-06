package com.javapractice;

public class LoopingConcept {
	public static void main(String[] args) {

		// for(Initialization; Condition check; Increment or decrement)
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.println("* ");
			}
			System.out.println();
		}

		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}

		int o = 0;
		while (o < 20) {
			System.out.println("While loop");
			o++;
		}

		int p = 0;
		do {
			System.out.println("DO while");
		} while (p < 20);
		p++;

	}
}
