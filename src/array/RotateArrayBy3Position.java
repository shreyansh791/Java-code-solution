package array;

public class RotateArrayBy3Position {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = 1; i <= 3; i++) {
			int last = a[a.length - 1];
			for (int j = a.length - 1; j > 0; j--) {
				a[j] = a[j - 1];
			}
			a[0] = last;
		}

		for (int temp : a)
			System.out.print(temp);
	}
}
