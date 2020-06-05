package Array2;

import java.util.Scanner;

public class DayOfYear {
	// 각 달의 일수 (클래스 변수) 2행 12열
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };// 윤년

	static int isLeap(int year) { // 윤년1 평년 0
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	static int dayOfYear(int y, int m, int d) {// 2020 /4/ 20
		int days = d; // 일수
		for (int i = 1; i < m; i++) {// 1<4 2<4 3<4
			days = days + mdays[isLeap(y)][i - 1];// 20+31+29+31
		}

		return days;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		System.out.println("그 해 경과 일수를 구합니다");
		do {
			System.out.print("년 :");
			int year = sc.nextInt();
			System.out.print("월 :");
			int month = sc.nextInt();
			System.out.print("일 :");
			int day = sc.nextInt();
			System.out.printf("그 해 %d 일째 입니다.\n", dayOfYear(year, month, day));
			System.out.print("한번 더 할까요?(1.예 / 0.아니요))");
			retry = sc.nextInt();
		} while (retry == 1);
	}

}
