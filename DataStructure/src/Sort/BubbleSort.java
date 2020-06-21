package Sort;

import java.util.Scanner;

public class BubbleSort {
	static void swap(int[] a, int idx1, int idx2) {

		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블 정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			int exchg = 0;
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1] > a[j]) {
					swap(a, j - 1, j);
					exchg++;
				}
				if (exchg == 0)
					break;
			}

		}

	}

	public static void main(String[] args) {
		System.out.println("버블정렬 버전1)");
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
		System.out.println();
		System.out.println("오름차순으로 정렬하였습니다.");
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] :" + a[i] + " ");
		}

	}
}
