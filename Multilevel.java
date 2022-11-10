package com.Javapractice;

public class Multilevel extends  Inheritance {
	public void thirdClass() {
		System.out.println("define multilevel");
	}
	public static void main(String[] args) {
		Multilevel c = new Multilevel();
		c.firstClass();
		c.todayTopic();
		c.secondClass();
		c.dayTwo();
		c.thirdClass();
	}
}
