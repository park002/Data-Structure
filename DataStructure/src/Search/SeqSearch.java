package Search;

import java.util.Scanner;

public class SeqSearch {
	static int Search(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			System.out.print("x[" + i + "] :");
			a[i] = sc.nextInt();
		}
		System.out.print("�˻��� �� : ");
		int key = sc.nextInt();
		if (Search(a, key) != -1) {
			System.out.println("�˻��� �� : " + key + "��(��) \t" + "a[" + Search(a, key) + "] �� ���� �մϴ�.");
		} else {
			System.out.println("�� ���� ��Ұ� �����ϴ�");
		}
	}
}
