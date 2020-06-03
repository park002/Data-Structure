package Array1;

import java.util.Scanner;

public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print(r + "|\t\t" + x + "\n +------------");
		System.out.println();
		do {
			d[digits++] = dchar.charAt(x % r); // 59%2 , 29%2, 14%2, 7%2 3%2
			System.out.print(r + "|\t\t" + x / r + " ..." + (x % r) + "\n +------------");
			System.out.println();
			x /= r;
		} while (x != 0);
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
	public static void main(String[] args) {
		int no; // 변환되는 정수 ex) 752, 56
		int cd; // 기수 2진수,16진수,8진수,32진수
		int dno; // cardConvR( ) 실행후 -->변환 후의 자릿수
		int retry; // 다시 한번 ?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수를 기수 변환 합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌정수 :");
				no = sc.nextInt(); // 59
			} while (no < 0);
			do {
				System.out.print("어떤 진수로 변환할까요 ? (2~36) :");
				cd = sc.nextInt(); // 2

			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);
			System.out.print(cd + "진수로 ");
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			System.out.print("한번 더 할 까요? (1.예 0.아니요) :");
			retry = sc.nextInt();
		} while (retry == 1);

	}
}
