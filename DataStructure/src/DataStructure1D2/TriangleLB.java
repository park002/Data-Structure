package DataStructure1D2;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		System.out.println("왼쪽아래가 직각인 이등변 삼각형을 출력합니다");
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("몇 단 삼각형입니까?");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
