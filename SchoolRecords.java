package com.lulu.assessment;

import java.util.Scanner;

public class SchoolRecords {
	Scanner sc = new Scanner(System.in);
	int id = sc.nextInt();
	String name = sc.next();
	String address = sc.next();

	void addRecords() {
		System.out.println("Records added");
	}

	void displayRecords() {
		System.out.println("Here is the list");
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}

	public static void main(String[] args) {

		System.out.println("Enter the records:");
		SchoolRecords sr = new SchoolRecords();
		sr.addRecords();
		sr.displayRecords();

	}
}