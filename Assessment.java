package com.lulu.assessment;

public class Assessment {
	public static void main(String[] args) {
		int p = 10000;
		float t = 3;
		float r = 12;
		float si,amount;
		si = (p * t * r) / 100;
		System.out.println("the simple interest is" + si);
		amount = si+p;
		System.out.println("The total amount to be paid is"+amount);
		

	}
}
