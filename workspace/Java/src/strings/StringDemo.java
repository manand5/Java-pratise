package strings;

public class StringDemo {
	public String toString() {
		return "To string method";

	}

	public static void main(String[] args) {
		String s1 = new String("1st String");
		String s2 = ("2nd String ");
		StringBuffer s3 = new StringBuffer("3rd String Buffer");
		s1.concat("4th String concat");
		s3.append("3rd String Buffer appended");
		String s5 = "5th string";
		String s6 = s1.concat(s5);
		String s7, s8;
		s7 = "7th string ";
		s8 = " 8th string";
		s7 = s7.concat(s8);
		//s7 = s7 + s8;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		// System.out.println(s4);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		// System.out.println(s4.toString());
		System.out.println(s7);
	}

}
