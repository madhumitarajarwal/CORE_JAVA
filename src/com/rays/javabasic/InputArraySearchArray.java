package com.rays.javabasic;

public class InputArraySearchArray {

	public static void main(String[] args) {

		int numbers[] = { 4, 5, 6, 7, 9, 2, 3 };
		int key = 100;
		int index = Search(numbers, key);
		if (index == -1) {
			System.out.println("key not Found:" + key);
		} else {
			System.out.println("key is found at index:" + key);
		}

	}

	public static int Search(int[] numbers, int key) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}

		}
		return -1;

	}
}
