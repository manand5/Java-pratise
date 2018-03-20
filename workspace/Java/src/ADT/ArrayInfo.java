package ADT;

class ArrayInfo {
	public String countevens(int elements[]) {
		int count = 0;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 == 0) {
				count++;
				System.out.print(elements[i] + ", ");
			}
		}
		return "Total  Even numbers present the Array " + count;
	}

	public String countodds(int elements[]) {
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0) {
				count++;
				System.out.print(elements[i] + ", ");
			}
		}
		return "Total odd numbers " + count;
	}

	public String arrayreverse(int elements[]) {

		for (int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + ", ");

		}
		System.out.println("Given Array");

		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.print(elements[i] + ", ");
		}
		return " Array reverse ";
	}

	public String biggestNumber(int[] a) {
		int maxValue = 0;
		for (int i : a) {
			if (i > maxValue) {
				maxValue = i;
			}
		}

		return " The biggest number in given Array is " + maxValue;
	}

	public String smallestNumber(int[] a) {
		int minValue = 0;
		for (int i : a) {
			if (i < minValue) {
				minValue = i;
			}
		}
		return "The smallest number in given Array is " + minValue;
	}

	public String findIndexValue(int index, int[] a) {
		if (index > a.length || index < 0) {
			System.out.println("Index should be between 0 to max lenght of array");
		} else {
			System.out.println(a[index]);
		}
		return " Index " + index + "value is " + a[index];
	}

	public void sort(int arr[]) {
		int N = arr.length;
		int i, j, temp;
		for (i = 1; i < N; i++) {
			j = i;
			temp = arr[i];
			while (j > 0 && temp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
	}

}
