package Array1;

import java.util.Scanner;

public class CardConvRev2 {
	static int CardConvrev(int x, int r, char c[]) {
		int index = 0;
		String j = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			c[index++] = j.charAt(x % r);
			x = x / r;
		} while (x != 0); // x 가 0이 될떄까지 반복하라.
		return index;
	}

	public static void main(String[] args) {
		int x; // 음수가 아닌 정수
		int r; // 기수 변환 ex)2진수 8 16 32
		char c[] = new char[32]; // 배열
		int index; // 자릿수 뽑을 것
		int retry; // 종료할건지 말건지 여부 .
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.print("음수가 아닌 정수만을 입력하세요");
				x = sc.nextInt();
			} while (x < 0);
			do {
				System.out.print("기수변환을 할  진수를 입력하세요 (2~36)");
				r = sc.nextInt();
			} while (r < 2 || r > 36);

			index = CardConvrev(x, r, c);

			for (int i = index - 1; i >= 0; i--) {
				System.out.print(c[i]);
			}
			System.out.println("프로그램을 종료하실껍니까? 예(1),아니요(0)");
			retry = sc.nextInt();
		} while (retry != 1);
	}
}
