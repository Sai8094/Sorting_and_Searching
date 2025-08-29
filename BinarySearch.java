package com.sortingandsearching;

import com.linkedlist.Node;
import com.linkedlist.ListOperations;

public class BinarySearch<T extends Comparable<T>> {

	public static void main(String[] args) {
		ListOperations<Integer> list = new ListOperations<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		System.out.println(binarySearch(list.head, 7));
	}

	public static <T extends Comparable<T>> boolean binarySearch(Node<T> head, T target) {
		Node<T> start = head;
		Node<T> end = null;

		ListOperations<T> operation = new ListOperations<>();

		while (start != end) {
			
			Node<T> middle = operation.findMiddle(start, end);

			if (middle == null) {
				return false;
			}

			int middleData = middle.data.compareTo(target);

			if (middleData == 0) {
				return true;
			} else if (middleData < 0) {
				start = middle.next;
			} else {
				end = middle;
			}
		}
		return false;
	}
}
