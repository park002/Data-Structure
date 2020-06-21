package Recursive;

import java.util.Scanner;

public class Factorial {
	// 팩토리얼을 재귀적으로 구현
	static int factorial(int n) {
		if (n > 0) {
			return n * factorial(n - 1); //
		} else
			return 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x = sc.nextInt();
		System.out.println(x + "의 factorial은 " + factorial(x) + "입니다.");
	}
}
