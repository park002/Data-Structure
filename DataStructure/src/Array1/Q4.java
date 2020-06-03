package Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	static void rcopy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 길이를 입력하세요 :");
		int na = sc.nextInt();
		int a[] = new int[na];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10) + 1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.print("b의 길이를 입력하세요 :");
		int nb = sc.nextInt();
		int b[] = new int[nb];
		for (int i = 0; i < b.length; i++) {
			b[i] = (int) (Math.random() * 10) + 1;
		}
		System.out.println("b배열의 모든 요소 : " + Arrays.toString(b));
		rcopy(a, b);
		System.out.println("a배열의 모든 요소 : " + Arrays.toString(a));
	}

}
