package DataStructure1D2;

public class Q13 {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("\t |");
		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		System.out.println("\t-+------------------------------------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i + "|");
			for (int j = 1; j <= 9; j++) {
				sum += i;
				System.out.print("\t" + sum);
			}
			System.out.println();
		}

	}
}
