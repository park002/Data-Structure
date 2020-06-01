package Array1;

import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int index1, int index2) {
		int t = a[index1];
		a[index1] = a[index2];
		a[index2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
			System.out.println("x[" + i + "] = " + x[i]);
		}
		reverse(x);
		System.out.println("요소를 역순으로 정렬 했습니다");
		for (int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
