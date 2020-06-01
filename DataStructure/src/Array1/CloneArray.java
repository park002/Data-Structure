package Array1;

public class CloneArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone();
		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}
