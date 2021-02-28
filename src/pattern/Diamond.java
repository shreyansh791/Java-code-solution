package pattern;

public class Diamond {
	public static void main(String[] args) {

		for (int i = 9; i >= 1; i = i - 2) {
			int count = 0;
			for (int j = 1; j <= 9; j = j + 2) {
				if (j < i) {
					System.out.print(" ");
				}
				while (count <= (j - i)) {
					System.out.print("*");
					count++;
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= (7 - i + 1); j++) {
				if (j == 1)
					System.out.print(" ");
				if (i <= j) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
