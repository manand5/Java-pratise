package com.arrayistexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Example1 {

	private Scanner userInput;

	public ArrayList<String> add_names() {
		ArrayList<String> name = new ArrayList<String>();
		userInput = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter");
		int number_Of_Elements = userInput.nextInt();
		String s;
		if (number_Of_Elements < 1) {
			System.out.println("Enter valid number");

		} else {
			for (int i = 0; i <= number_Of_Elements; i++) {
				s = userInput.nextLine();
				name.add(s);
			}
		}

		return name;
	}

	public void print_names(ArrayList<String> name) {
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		Example1 e = new Example1();
		ArrayList<String> name = e.add_names();
		name.add("anand");
		e.print_names(name);
		// name.add("anand");
		// e.print_names(name);
		// int index2 = name.indexOf("anand");
		// int index = name.lastIndexOf("anand");

		// System.out.println(index2 + " Index of");
		// System.out.println(index+ " last index of");
		// name.removeAll(name);
		name.remove(0);
		e.print_names(name);
		System.out.println(name.isEmpty());

	}
}