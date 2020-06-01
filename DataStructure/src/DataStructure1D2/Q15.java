package DataStructure1D2;

import java.util.Scanner;

public class Q15 {
	static void triangleB(int n) { // 왼쪽 아래가 직각인 이등변 삼각형을 출력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}

	static void triangleLU(int n) { // 왼쪽 위가 직각인 이등변 삼각형을 출력합니다
		for (int i = 1; i <= n; i++) {
			for (int j = n; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}

	static void triangleRU(int n) { // 오른쪽 위가 직각인 이등변 삼각형을 출력합니다
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j)
					System.out.print("  ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRB(int n) { // 오른쪽 아래가 직각인 이등변 삼각형을 출력합니다
		for (int i = 1; i <= n; i++) {
			for (int j = n; 1 <= j; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		System.out.println("몇 단 삼각형입니까?");
		triangleB(sc.nextInt());

		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다");
		System.out.println("몇 단 삼각형입니까?");
		triangleLU(sc.nextInt());

		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다");
		System.out.println("몇 단 삼각형입니까?");
		triangleRU(sc.nextInt());

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다");
		System.out.println("몇 단 삼각형입니까?");
		triangleRB(sc.nextInt());

	}
}
