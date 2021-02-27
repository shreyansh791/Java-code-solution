package array;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 7, 2,1 };
		int[] reverseArray = new ReverseArray().reverseArray(a);
		Arrays.stream(reverseArray).forEach(i -> System.out.print(i));

	}

	private int[] reverseArray(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}
}
