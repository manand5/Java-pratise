package com.demo;

public class Emp {
	protected String name;
	protected int id;
    Emp(){
    	System.out.println("Parent default");
    }
	public Emp(int id, String name) {
		this.name = name;
		this.id = id;

	}
	public void m1(){
		System.out.println("this is parent method");
	}

	

}
class Teacher extends Emp{
	Teacher(){
		System.out.println(" Child default");
	}

	Teacher(int id, String name) {
		super(id, name);
		
	}
	@Override
	public void m1(){
		System.out.println("this is child method");
		super.m1();
	}

	public static void main(String[] args) {
		Emp e = new Emp(32, "Anand");
		Emp t = new Teacher(45,"AnandBharadwaj");
		System.out.println(e.id+" "+e.name);
		System.out.println(t.id+" "+t.name);
		//new Teacher().m1();
		t.m1();
		e.m1();
	   
		
		
		
	}
	
}
