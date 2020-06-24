package Sort;

import java.util.Scanner;

public class BubbleSort3 {
	static void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}

	static void selectSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++)
				if (a[j] < a[min]) {
					min = j;
				}
			swap(a, i, min);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿ä¼Ú ¼ö :");
		int x = sc.nextInt();
		int[] a = new int[x];
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] =");
			a[i] = sc.nextInt();
		}
		selectSort(a, x);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
