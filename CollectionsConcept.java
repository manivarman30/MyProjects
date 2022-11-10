package com.Javapractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsConcept {

	public static void arrayListMethod() {

		System.out.println("********ARRAYLIST********");

		List<String> arraylist = new ArrayList<String>();
		arraylist.add("Hero");
		arraylist.add("yamaha");
		arraylist.add("Honda");
		arraylist.add("Suzuki");
		arraylist.add("Suzuki"); // add - adding
		arraylist.add(null);

		System.out.println(arraylist);
		System.out.println(arraylist.get(4)); // get - retrieve
		System.out.println(arraylist.indexOf("Yamaha"));
		System.out.println(arraylist.lastIndexOf("Suzuki"));
		System.out.println(arraylist.indexOf("kawasaki"));

		List<String> newarraylist = new ArrayList<String>();
		newarraylist.addAll(arraylist);
		System.out.println(newarraylist);
		newarraylist.clear();
		System.out.println(newarraylist);

		arraylist.remove(0);
		System.out.println(arraylist);

		arraylist.add(null);
		System.out.println(arraylist);
		arraylist.set(3, "Ola");
		System.out.println(arraylist);
		System.out.println(arraylist.isEmpty());

//Iterate for each
		for (String string : arraylist) {
			System.out.println("For each " + string);
		}
//For loop
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("For loop " + arraylist.get(i));
		}

		/*
		 * Multi Threading for (String string : arraylist) { System.out.println(string);
		 * arraylist.add("Porsche"); }
		 */

//CopyOnWriteArrayList<String> m = new CopyOnWriteArrayList<String>();

		System.out.println("********LINKEDLIST********");

		List<String> linkedlist = new LinkedList<String>();
		linkedlist.add("10");
		linkedlist.add("20");
		linkedlist.add("30");
		linkedlist.add("40");
		linkedlist.add("50");
		linkedlist.add("20");
		linkedlist.add("30");
		linkedlist.add(null);

		System.out.println(linkedlist);
		System.out.println(linkedlist.get(2));
		System.out.println(linkedlist.get(5));
		System.out.println(linkedlist.lastIndexOf("20"));
		linkedlist.add(0, "STALLONE");
		System.out.println(linkedlist);
		System.out.println(linkedlist.get(1));
		System.out.println(linkedlist.remove(0));
		
		
		linkedlist.clear();
		
		System.out.println(linkedlist);


	}

	public static void main(String[] args) {
		arrayListMethod();
	}
}
