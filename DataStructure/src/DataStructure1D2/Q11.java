package DataStructure1D2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		int count = 0;

		do {
			System.out.println("양의 정수만 입력하세요");
			n = sc.nextInt();
		} while (n <= 0);

		while (n > 0) { // 100 10
			n /= 10;// 10 1 0
			count++;// 1 2 3
		}
		System.out.printf("그 수는 %d자리 입니다", count);

	}
}
