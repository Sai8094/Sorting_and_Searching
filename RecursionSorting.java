package com.sortingandsearching;

import com.stack.MainStack;

public class RecursionSorting<T extends Comparable<T>> {

	public void sortStack(MainStack<T> stack) {
		if (stack.isEmpty()) {
			return;
		}
		T element = stack.peek();
		stack.pop();
		sortStack(stack);
		insertAtBottom(stack, element);
	}

	public void insertAtBottom(MainStack<T> stack, T element) {
		if (stack.isEmpty() || element.compareTo(stack.peek()) < 0) {
			stack.push(element);
			return;
		}

		T top = stack.peek();
		stack.pop();
		insertAtBottom(stack, element);
		stack.push(top);
	}

	public static void main(String[] args) {
		MainStack<Integer> stack = new MainStack<>();
		stack.push(23);
		stack.push(89);
		stack.push(3);
		stack.push(29);

		RecursionSorting<Integer> sorter = new RecursionSorting<>();
		sorter.sortStack(stack);
		stack.display();
	}
}
