class A {
	static String str = "A class string";
	String name="A parent class string";
	static int val=10;
	A get() {
		System.out.println("parent ..");
		return this;
	}
}
class B extends A{
	int val=103;
	int val1 =10000;
	static String str = "B class string";
	String name="B parent class string";
}

class B1 extends B {
	int val=1000;
	static String str = "B1 class string";
	String name="B1 Child class string";
	
	B1 get() {
		System.out.println("child..");
		//return new B1();
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}
	B1(){
		//ssuper.val= val;
		System.out.println(this.val);
		System.out.println(super.val);
		//System.out.println(val1);
		//System.out.println(super.super.val);
	}

	public static void main(String args[]) {
		//new B1().get().message();
		//new B1().message();
		//new A().get();
		//new B1().get();
		@SuppressWarnings("unused")
		B1 b = new B1();
		//System.out.println(b.name);
		//System.out.println(A.str + B.str + B1.str);
	}
}