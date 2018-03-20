
//  Maximum difference between two elements such that larger element appears after the smaller number

//for (i = 0; i < a.length; i++) {
//			for (j = a.length - 1; j > i; j--) {
//				int dif = a[j] - a[i];
//				if (dif > maxDiffrence)
//					maxDiffrence = dif;
//			}
//		}
//		System.out.println(maxDiffrence);

package ADT;

public class Intarray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 0, 9, 10, -2, -3, 20, 3, 30, 50, 40, -2 };
		int maxDiffrence1 = a[1] - a[0], minVal = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] - minVal > maxDiffrence1) {
				maxDiffrence1 = a[i] - minVal;
			}
			if (a[i] < minVal) {
				minVal = a[i];
			}
		}
		System.out.println(maxDiffrence1);
	}

}
