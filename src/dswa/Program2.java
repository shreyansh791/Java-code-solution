package dswa;

import java.util.Arrays;

public class Program2 {
	public static void main(String[] args) {
		int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		int counter = 0;
		while (counter < a.length) {
			boolean found = false;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == counter) {
					int temp = a[counter];
					a[counter] = a[j];
					a[j] = temp;
					found = true;
				}
			}
			if (counter + 1 == a.length - 1 && found == false) {
				int temp = a[counter];
				a[counter] = -1;
				a[counter+1] = temp;
			}
			if (found == false) {
				a[counter] = -1;
			}
			counter++;
		}
		Arrays.stream(a).forEach(i -> {
			System.out.print(i + " ");
		});
	}
}