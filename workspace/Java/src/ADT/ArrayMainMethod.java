package ADT;

import java.io.IOException;
import java.util.Scanner;

public class ArrayMainMethod {

	public static void main(String[] args) throws IOException {
		ArrayInfo arrayObject = new ArrayInfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int input = sc.nextInt();
		int[] array = new int[input];
		System.out.println("Enter Array elements");
		for (int i = 0; i < input; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println(arrayObject.arrayreverse(array));
		System.out.println(arrayObject.countevens(array));
		System.out.println(arrayObject.countodds(array));
		System.out.println(arrayObject.biggestNumber(array));
		System.out.println(arrayObject.smallestNumber(array));
        System.out.println(" Enter the index of the number you want to print ");
        int index =sc.nextInt();
        System.out.println(arrayObject.findIndexValue(index,array));
        arrayObject.sort(array);
        
	}
}
