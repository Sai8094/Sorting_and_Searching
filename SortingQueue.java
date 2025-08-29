package com.sortingandsearching;

import com.queue.QueueOperations;
import com.stack.MainStack;

public class SortingQueue<T extends Comparable<T>> {

	public static void main(String[] args) {
		QueueOperations<Integer> queue = new QueueOperations<>();
		queue.enqueue(8);
		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(1);

		queue.display();

		SortingQueue<Integer> sort = new SortingQueue<>();
		sort.sortQueue(queue);
		System.out.println();
		queue.display();
	}

	public void sortQueue(QueueOperations<T> queue) {
		MainStack<T> stack = new MainStack<>();

		while (!queue.isEmpty()) {
			T element = queue.dequeue();

			while (!stack.isEmpty() && element.compareTo(stack.peek()) > 0) {
				queue.enqueue(stack.pop());
			}
			stack.push(element);
		}
		while (!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
	}
}
