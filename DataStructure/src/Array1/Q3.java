package Array1;

import java.util.Scanner;

public class Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 50) + 1; // 1부터 51미만 까지
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("배열 a의 모든 요소의 합계 : " + sumOf(a));
	}
}
