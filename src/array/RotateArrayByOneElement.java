package array;

import java.util.Arrays;

public class RotateArrayByOneElement {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 9 }; // 9,1,3,5,7
		int j = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = j;
		for (int k : a)
			System.out.print(k);
	}
}
