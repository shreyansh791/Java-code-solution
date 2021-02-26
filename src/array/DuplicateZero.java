package array;

import java.util.Arrays;

public class DuplicateZero {
	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 1, 3, 0, 1, 1 }; // 10021300
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				insert(a, i);
				a[i++] = 0;
			}
		}
		Arrays.stream(a).forEach(i->System.out.print(i+" "));

	}

	private static void insert(int[] a, int i) {
		for (int j = a.length - 1; j > i; j--) {
			a[j] = a[j - 1];
		}
	}
}
