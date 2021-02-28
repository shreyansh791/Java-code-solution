package array;

public class Merge2SortedArray {
	public static void main(String[] args) {
		int a[] = { 3, 7, 9, 11 };
		int b[] = { 1, 2, 4, 5, 6, 12 };
		int firstArrayLength = a.length;
		int secondArrayLength = b.length;
		int mergeArray[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < firstArrayLength && j < secondArrayLength) {
			if (a[i] < b[j]) {
				mergeArray[k++] = a[i++];
			} else {
				mergeArray[k++] = b[j++];
			}
		}
		while (i < firstArrayLength) {
			mergeArray[k++] = a[i++];
		}
		while (j < secondArrayLength) {
			mergeArray[k++] = b[j++];
		}
		for (int p = 0; p < mergeArray.length; p++)
			System.out.print(mergeArray[p] + " ");
	}
}
