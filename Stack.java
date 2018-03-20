package ds.stack;

import java.util.Scanner;

public class Stack {
	private int maxSize;
	private Object[] stackArray;
	private int topIndex;

	public Stack(int size) {
		this.maxSize = size; // size of the stock
		this.stackArray = new Object[maxSize]; // giving size to stack array
		this.topIndex = -1; // no elements

	}

	public void push(Object item) {
		if (isFull()) {
			System.out.println("Stack is already full");
		} else {
			stackArray[++topIndex] = item;
		}
	}

	public Object pop() {
		if (isEmpty()) {
			System.out.println("Stack is already empty");
			return '0';
		} else {
			int oldTop = topIndex--;
			return stackArray[oldTop];
		}
	}

	public void disply() {
		while (topIndex != -1) {
			System.out.print(stackArray[topIndex--] + " ");
		}
		System.out.println();
	}

	public Object peakElement() {
		System.out.println("Top index is " + topIndex);
		return stackArray[topIndex];
	}

	public int topIndex() {
		return topIndex;
	}

	public boolean isEmpty() {
		return (topIndex == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == topIndex);
	}
}

class App1 {

	private static Scanner input;

	public static String reverseTheString() {
		input = new Scanner(System.in);
		System.out.println("Enter the String to reverse ");
		String str = input.nextLine();
		int stackSize = str.length();
		Stack s = new Stack(stackSize);
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			s.push(c);
		}
		while (!s.isEmpty()) {
			char c = (char) s.pop();
			result = result + c;
		}
		return result;
	}

	public static void stack_Operations() {
		input = new Scanner(System.in);
		System.out.println("Enter the stack size ");
		int stackSize = input.nextInt();
		Stack element = new Stack(stackSize);
		System.out.println("Enter the elements");
		Object item;
		for (int i = 0; i < stackSize; i++) {
			item = input.next();
			element.push(item);
		}
		element.disply();

	}

	public static void main(String[] args) {
		input = new Scanner(System.in);
        
		//System.out.println(reverseTheString());
		// stack_Operations();

	}

}
