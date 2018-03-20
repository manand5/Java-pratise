import ADT.EvenOdd;

public class GetterAndSetter {
	private String name;
	private int age;
	private int salary;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Implement {
	public static void main(String[] args) {

		EvenOdd eo = new EvenOdd();
		int[] a = { 1, 2, 3, 4, 5, 6, -232, 0, 23, 1, -1, -0 };
		int[] even = eo.evens(a);
		System.out.println("even numbers");
		for (int evenItem : even) {
			if (evenItem != 0)
				System.out.print(evenItem + "  ");

		}

	}

}