
public class Human {
	private String name;
	private int age;
	private int height;
	private String eyeColor;

	Human(String name, int age, int height, String eyeColor) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeColor = eyeColor;

	}

	public void speak() {
		System.out.println(" Hello my name is " + name);
		System.out.println(" my age is " + age);
		System.out.println(" my height is " + height + " Centimeters");
		System.out.println(" my eye color is " + eyeColor);
	}

	public void eating() {
		System.out.println(" Eating");
	}

	public void walk() {
		System.out.println(" Walking");
	}
}

class Earth {
	public static void main(String[] args) {
		Human tom = new Human("Tom", 25, 175, "Blue");
		tom.speak();
		tom.eating();
		tom.walk();
	}
}
