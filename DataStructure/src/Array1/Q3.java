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
		System.out.print("��ڼ� : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 50) + 1; // 1���� 51�̸� ����
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("�迭 a�� ��� ����� �հ� : " + sumOf(a));
	}
}
