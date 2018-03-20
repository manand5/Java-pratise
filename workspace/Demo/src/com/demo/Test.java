package com.demo;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp(111, "Anand");
		Emp e2 = new Emp(222, "Bharadwaj");
		Emp e3 = new Emp(333, "MAB");

		ArrayList<Emp> a1 = new ArrayList<Emp>();
		a1.add(e1);
		a1.add(e2);
		ArrayList<Emp> a2 = new ArrayList<Emp>();
		a2.addAll(a1);
		a2.add(e3);
		for(Emp employee:a1){
			System.out.println(employee.name+ " "+ employee.id);
		}
		for(Emp employee:a2){
			System.out.println(employee.name+ " "+ employee.id);
		}
       System.out.println(a2.containsAll(a1));
	}

}
