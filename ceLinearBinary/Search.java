package ceLinearBinary;

import java.util.Arrays;

public class Search {
	
	/**
	* Searches the array numbers for the
	* specified key based on the linear
	* search algorithm.
	*
	* @param numbers
	* @param key the number that we are looking for
	* @return the index of the first occurrence of the key
	* in the array, -1 if the key was not found or 0
	* if the array is empty.
	*/
	public static int linear(int[] numbers, int key) {
		if (numbers.length < 1) {
			return 0;
		}
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binary(int[] numbers, int key) {
		Arrays.sort(numbers);
		int min = 0;
		int max = numbers.length - 1;
		while (min <= max) {
			int middle = (min + max) / 2;
			
			if (numbers[middle] == key) {
				return middle;
			} else if (numbers [middle] < key) {
				min = middle + 1;
			} else {
				max = middle -1;
			}
			
		}
		if (numbers.length < 1) {
			return 0;
		}
		return -1;
	}
}
