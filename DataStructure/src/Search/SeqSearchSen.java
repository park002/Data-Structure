package Search;

import java.util.Scanner;

public class SeqSearchSen { // ���ʹ�
	static int seqSearchSen(int[] a, int num, int key) {
		int i = 0;
		a[num] = key; // �迭�� ������ ��ҿ� key���� ���� ==���ʹ�
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == num ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");

		int num = sc.nextInt();

		int[] a = new int[num + 1];
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("�˻��� �� : ");
		int key = sc.nextInt();
		int index = seqSearchSen(a, num, key);
		if (index == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�");
		else
			System.out.println(key + "�� x[" + index + "] �� �ֽ��ϴ�");
	}

}
