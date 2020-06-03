package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {
	static boolean equals(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 a의 요솟수 : ");
		int na = sc.nextInt();
		int[] a = new int[na];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("배열 a의 요소들 : " + Arrays.toString(a));

		System.out.println("배열 b의 요솟수 : ");
		int nb = sc.nextInt();
		int[] b = new int[nb];

		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println("배열 b의 요소들 : " + Arrays.toString(b));

		System.out.println("배열 a,b는 " + (equals(a, b) ? "같습니다" : "같지 않습니다"));
	}

}
