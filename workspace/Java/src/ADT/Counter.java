package ADT;

public class Counter {
	private String name = null;
	private int value = 0;

	public Counter(String str) {
		this.name = str;
	}

	public void increament() {
		value++;
		System.out.println(value);
	}

	public int getCurrentValue() {

		return value;
	}

	public String toString() {
		return name + " : " + value;
	}

}
