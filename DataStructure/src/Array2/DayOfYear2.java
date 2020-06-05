package Array2;

import java.util.Scanner;

public class DayOfYear2 {
	static int[][] year = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 0�� ��� 0~11
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 1�� ���� 0~11

	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 1 : 0);
	}

	static int day(int y, int m, int d) {
		int days = year[isLeap(y)][m - 1] - d;
		for (int i = m; i < 12; i++) { // 2
			days = days + year[isLeap(y)][i];

		}
		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		int year;
		int m;
		int d;
		System.out.println("�� �� ���� �ϼ��� ���մϴ�.");
		do {
			System.out.print("�� :");
			year = sc.nextInt();
			System.out.print("�� :");
			m = sc.nextInt();
			System.out.print("�� : ");
			d = sc.nextInt();
			System.out.println("�� �� ���� �ϼ� " + day(year, m, d) + "�� �Դϴ�.");
			System.out.println("�ѹ� �� �ұ��? (1.��/2.�ƴϿ�)");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
