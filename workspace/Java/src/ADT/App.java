package ADT;

public class App {

	public static void main(String[] args) {

		Counter myCounter = new Counter("myCounter");
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		myCounter.increament();
		System.out.println(myCounter.getCurrentValue());
	}

}
