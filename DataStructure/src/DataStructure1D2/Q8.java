package DataStructure1D2;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		// 1부터 10 까지의 합은 (1+10)*5 와 같은 방법으로 구할 수 있다 . 가우스의 덧셈이라는 방법을 이용하여 1부터 n 까지의 정수
		// 합을
		// 구하는 프로그램을 작성하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("n 값을 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = n * (1 + n) / 2;
		}
		System.out.println("sum=" + sum);
	}

}
