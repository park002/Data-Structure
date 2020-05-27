package DataStructure1D2;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두자리의 정수를 입력하세요");
		int n;
		do {
			System.out.print("입력 : ");
			n = sc.nextInt();
		} while (!(n >= 10 && n <= 99));

		System.out.println("변수 n 의 값은" + n + "가(이)되었습니다");

	}
}
