package Sort;

import java.util.Scanner;

public class BubbleSort2 {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Q1)");
		System.out.print("요솟 수 ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] :");
			a[i] = (int) (Math.random() * 100) + 1;
			System.out.println(a[i]);
		}
		bubbleSort(a, a.length);
		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] :" + a[i] + " ");
		}
	}
}
