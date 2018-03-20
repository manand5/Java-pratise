package com.demo;

public class Example1 {

	public static void main(String[] args) {
		String name = "Selenium WebDriver";
		String name1 = "  Welcome to Selenium WebDriver   ";
		String name2 = "Welcome to selenium webDriver";
		String name4 = "Welcome-To-Selenium-Welcome-1";

		boolean status = name.startsWith("Selenium");
		boolean status1 = name1.equals(name2);
		boolean status2 = name1.equalsIgnoreCase(name2);
		boolean status3 = name.contains("Selenium");
		boolean status4 = name2.contains(name);
		String[] split = name4.split("-");
		System.out.println(status);
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		System.out.println(status4);
		System.out.println(name1.trim() + " trimmed ");
		System.out.println(name.charAt(6));
		for (String i : split) {
			if (i.equals("Welcome")) {
				System.out.print(i + " hi ");
				continue;
				// break;

			}

		}

	}

}
