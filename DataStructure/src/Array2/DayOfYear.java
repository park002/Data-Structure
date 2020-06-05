package Array2;

import java.util.Scanner;

public class DayOfYear {
	// �� ���� �ϼ� (Ŭ���� ����) 2�� 12��
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };// ����

	static int isLeap(int year) { // ����1 ��� 0
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {// 2020 /4/ 20
		int days = d; // �ϼ�
		for (int i = 1; i < m; i++) {// 1<4 2<4 3<4
			days = days + mdays[isLeap(y)][i - 1];// 20+31+29+31
		}

		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("�� �� ��� �ϼ��� ���մϴ�");
		do {
			System.out.print("�� :");
			int year = sc.nextInt();
			System.out.print("�� :");
			int month = sc.nextInt();
			System.out.print("�� :");
			int day = sc.nextInt();
			System.out.printf("�� �� %d ��° �Դϴ�.\n", dayOfYear(year, month, day));
			System.out.print("�ѹ� �� �ұ��?(1.�� / 0.�ƴϿ�))");
			retry = sc.nextInt();
		} while (retry == 1);
	}

}
