package ADT;

public class Overridden {
	public void m1() {
		System.out.println("m1 public method parent");

	}

	public static void m2() {
		System.out.println("m2 public static method parent");

	}

	private void m3() {
		System.out.println("m3 private method parent");
	}

	private static void m4() {
		System.out.println("m4 private static method parent");

	}

	public final void m5() {
		System.out.println("m5 public final method parent");
	}

	private final static void m6() {
		System.out.println("m6 private final static method parent");

	}

}

class Overriding extends Overridden {
	public void m1() {
		System.out.println("m1 public  method child");

	}

	public static void m2() {
		System.out.println("m2 public static  method child");

	}

	private void m3() {
		System.out.println("m3 private method child");
	}

	private static void m4() {
		System.out.println("m4 private static method child");

	}

	// public final void m5() {
	// System.out.println("m5 public final method parent");
	// }

	private final static void m6() {
		System.out.println("m6 private final static method parent");

	}

	public static void main(String[] args) {

		Overridden o1 = new Overriding();

		Overridden o2 = new Overridden();

		Overriding o3 = new Overriding();

		o1.m1();
		o1.m2();
		// o1.m3();
		// o1.m4();
		o1.m5();
		// o1.m6();}

		o2.m1();
		o2.m2();
		// o2.m3();
		// o2.m4();
		o2.m5();
		// o2.m6();}

		o3.m1();
		o3.m2();
		o3.m3();
		o3.m4();
		o3.m5();
		o3.m6();

	}

}
