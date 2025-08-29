package com.sortingandsearching;

import com.linkedlist.Node;
import com.queue.QueueOperations;
import com.stack.MainStack;

public class QueueReversal<T extends Comparable<T>> {

	public static void main(String[] args) {
		QueueOperations<Integer> queue = new QueueOperations<>();
		queue.enqueue(23);
		queue.enqueue(13);
		queue.enqueue(37);
		queue.enqueue(89);
		queue.display();

		QueueReversal<Integer> reverseQueue = new QueueReversal<>();
		reverseQueue.reverse(queue.front);
	}

	public void reverse(Node<T> front) {
		MainStack<T> stack = new MainStack<>();
		QueueOperations<T> queue = new QueueOperations<>();

		Node<T> temp = front;
		while (temp != null) {
			stack.push(temp.data);
			temp = temp.next;
		}

		while (!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		System.out.println();
		queue.display();
	}
}
