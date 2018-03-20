package ds.queue;

import java.util.Scanner;

public class Queue {
	private int maxSize; // number of slots
	private Object queArray[]; // slots to insert data
	private int front; // index position for front
	private int rear; // index position for back.
	private int nElements; // counter to maintain the number of elements

	public Queue(int Size) {
		this.maxSize = Size;
		this.queArray = new Object[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nElements = 0;

	}

	public void insert(Object item) {
		if (isFull()) {
			System.out.println(" Array is already Full");
		} else {
			if (rear < maxSize - 1) {
				// rear = (rear+1)
				queArray[++rear] = item;
				nElements++;
			} else
				System.out.println("can't be inserted");
		}
	}

	public void disply() {
		System.out.print("[");
		for (int i = 0; i < queArray.length; i++) {
			if (queArray[i] != null)
				System.out.print(queArray[i] + " ");
		}
		System.out.println("]");
	}

	public Object remove() {
		Object temp = 0;
		if (isEmpty()) {
			System.out.println("Array is already empty");
		} else {
			temp = queArray[front];
			queArray[front++] = null;
			nElements--;
			resetArray(front, maxSize);
		}
		return temp;
	}

	private void resetArray(int front, int maxSize) {
		if (front == maxSize) {
			front = 0; // reset
			rear = -1;
		}
	}

	public Object peekFront() {
		System.out.print(" Peak front element is ");
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nElements == 0);
	}

	public boolean isFull() {
		return (nElements == maxSize);
	}
}

class App {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int size = input.nextInt();
		Queue q = new Queue(size);
		System.out.println(" Enter Array Elements..");
		for (int i = 0; i < size; i++) {
			Object item = input.next();
			q.insert(item);
		}
		System.out.println("after insertion queue ");
		q.disply();
		System.out.println(q.peekFront());
		for (int i = 0; i < size; i++) {
			q.remove();
			q.disply();
		}
		q.insert(10);
		q.insert(100);
		q.insert(1000);
		q.disply();

	}
}
