package array;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3 };
		int b[] = { 2, 4, 6, 8 };
		int firstArrayLen = a.length;
		int secondArrayLen = b.length;
		int mergeArray[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < firstArrayLen && j < secondArrayLen) {
			if (a[i] > b[j])
				mergeArray[k++] = b[j++];
			else
				mergeArray[k++] = a[i++];

		}
		while (i < firstArrayLen) {
			mergeArray[k++] = a[i++];
		}
		while (j < secondArrayLen) {
			mergeArray[k++] = b[j++];
		}
		Arrays.stream(mergeArray).forEach(d -> System.out.print(d + " "));
	}
}
