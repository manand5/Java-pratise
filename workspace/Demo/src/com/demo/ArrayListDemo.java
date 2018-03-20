package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<Object>();
		ArrayList<String> obj1 = new ArrayList<String>();
		obj.add(423);
		obj.add("Anand");
		obj.add(false);
		obj1.add("Anand");
		obj1.add("Bharadwaj");
		obj1.add("AnandBharadwaj M");
		Iterator<Object> i = obj.iterator();
		Iterator<String> j = obj1.iterator();
		Object val = null;
		while (i.hasNext()) {
			val = i.next();
			System.out.println(val + " non generic");

		}
		while (j.hasNext()) {
			val = j.next();
			System.out.println(val + "  generic");

		}
		System.out.println(obj + " " + obj1);

	}

}
