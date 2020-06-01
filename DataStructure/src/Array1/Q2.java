package Array1;

import java.util.Random;
import java.util.Scanner;

public class Q2 {
	static void swap(int a[], int index1, int index2) {
		System.out.println("a[" + index1 + "]��(��) " + "a[" + index2 + "] �� ��ȯ�մϴ�");

		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

	}
	static void reverse(int a[]) {

		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
		System.out.println("���� ������ ���ƽ��ϴ�");

	}

	public static void main(String[] args) {
		Random rand = new Random();

		Scanner sc = new Scanner(System.in);
		System.out.print("��ڼ� : ");

		int num = sc.nextInt();
		int[] arrays = new int[num];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = 1 + rand.nextInt(60); // 1���� 61�̸� ����
			System.out.print(arrays[i] + " ");
		}
		System.out.println();
		reverse(arrays);
		System.out.println();

	}
}
