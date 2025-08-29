package com.sortingandsearching;

public class RotatedSortedArray {

	public static void main(String[] args) {
		
		int[] input = {7,8,9,1,2,3,4,5,6};
		System.out.println(rotatedBinarySearch(input, 5));
		
		
	}

	public static  int rotatedBinarySearch(int[] input, int target) {
		int low = 0;
		int high = input.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;

			if (input[middle] == target)
				return middle;
			if (input[low] <= input[middle]) {
				if (input[low] <= target && target <= input[middle])
					high = middle - 1;
				else
					low = middle + 1;
			} else {
				if (input[middle] <= target && target <= input[high] )
					low = middle + 1;
				else
					high = middle - 1;
			}
		}
		return -1;
	}
}
