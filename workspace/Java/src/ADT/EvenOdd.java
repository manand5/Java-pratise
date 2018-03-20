package ADT;

public class EvenOdd {
	public int oddsnum(int elements[]) {
		int[] odds = new int[elements.length];
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0) {
				count++;
			}
		}
		return count;

	}

	public int[] odds(int elements[],int index) {
		int[] odds = new int[elements.length];
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0) {
				odds[count++] = elements[i];
			}
		}
		return odds;

	}

	public int[] evens(int elements[]) {

		int[] even = new int[elements.length];
		int count = 0;

		for (int i = 0; i < elements.length; i++) {

			if (elements[i] % 2 == 0) {
				even[count++] = elements[i];

			}

		}
		return even;
	}

}
