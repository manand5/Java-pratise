package com.demo;

import java.util.Scanner;

public class Example {

	private static Scanner input;

	public void arthematic_progression(double intialValue, double diffrence, int terms) {
		double series;
		int i = 1;
		while (i <= terms) {
			series = intialValue + ((i - 1) * diffrence);
			System.out.println(series);
			i++;
		}

	}

	public void geometric_progression(double intialValue, double ratio, int terms) {
		double series;
		double i = 1;
		while (i <= terms) {
			series = intialValue * Math.pow(ratio, i - 1);
			System.out.println(series);
			i++;

		}
	}

	public void hormonic_progression(double intialValue, double diffrence, int terms) {
		double series;
		int i = 1;
		while (i <= terms) {
			series = 1 / (intialValue + ((i - 1) * diffrence));
			System.out.println(series);
			i++;
		}

	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("select series  1 Arthematic   2.Geometric  3.Harmonic");
		int choice = input.nextInt();
		System.out.println("Enter the initial value in series");
		Double initialValue = input.nextDouble();
		switch (choice) {
		case 1: {

			System.out.println("Enter the difrence in series");
			Double diffrence = input.nextDouble();
			System.out.println("Enter the terms required");
			int terms = input.nextInt();
			if (terms > 0) {
				Example s = new Example();
				s.arthematic_progression(initialValue, diffrence, terms);
			} else {
				System.out.println("Enter valid terms");
			}
		}
			break;
		case 2: {

			System.out.println("Enter the ratio in series");
			double ratio = input.nextDouble();
			System.out.println("Enter the terms required");
			int terms = input.nextInt();
			if (terms > 0) {
				Example s = new Example();
				s.geometric_progression(initialValue, ratio, terms);
			} else {
				System.out.println("Enter valid terms");
			}
			break;
		}
		case 3: {

			System.out.println("Enter the difrence in series");
			Double diffrence = input.nextDouble();
			System.out.println("Enter the terms required");
			int terms = input.nextInt();
			if (terms > 0) {
				Example s = new Example();
				s.hormonic_progression(initialValue, diffrence, terms);
			} else {
				System.out.println("Enter valid terms");
			}

		}
			break;
		default:
			System.out.println("Enter valid choice");
		}

	}

}
