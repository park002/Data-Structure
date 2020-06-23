package Sort;

import java.util.Scanner;

public class BubbleSort3 {
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

	static void bubble(int[] a, int x) {
		for (int i = 0; i < x - 1; i++) {
			for (int j = 0; j < x - i - 1; j++) {
				if (a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 요솟 수 : ");
		int x = sc.nextInt();
		int[] a = new int[x];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10) + 1; // 1~10까지
			System.out.print(a[i] + " ");
		}
		bubble(a, x);
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
