
public class Circle {
	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double calculatearea() {
		System.out.print(" Area of circle is ");
		return Math.PI * (Math.pow(radius, 2));
	}

	public double calculateperimeter() {
		double diameter = 2 * radius;
		System.out.print(" Perimeter of circle is ");
		return Math.PI * diameter;
	}

	public double square(double a) {

		return Math.pow(a, 2);
	}

}

class Calculate {
	public static void main(String[] a) {
		Circle c = new Circle(12.0);

		System.out.println(c.calculatearea());
		System.out.println(c.calculateperimeter());
	}
}