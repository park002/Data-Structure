package DataStructure1D2;

public class Q12 {
	public static void main(String[] args) {
		System.out.print("\t |");
		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i);
		}
		System.out.println();
		System.out.println("\t-+------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print("\t" + i + "|");
			for (int j = 1; j <= 9; j++) {
				System.out.print("\t" + i * j);
			}
			System.out.println();
		}

	}
}
