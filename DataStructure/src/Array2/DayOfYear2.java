package Array2;

import java.util.Scanner;

public class DayOfYear2 {
	static int[][] year = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 0행 평년 0~11
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } }; // 1행 윤년 0~11

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
		System.out.println("그 해 남은 일수를 구합니다.");
		do {
			System.out.print("년 :");
			year = sc.nextInt();
			System.out.print("월 :");
			m = sc.nextInt();
			System.out.print("일 : ");
			d = sc.nextInt();
			System.out.println("그 해 남은 일수 " + day(year, m, d) + "일 입니다.");
			System.out.println("한번 더 할까요? (1.예/2.아니요)");
			retry = sc.nextInt();
		} while (retry == 1);
	}
}
