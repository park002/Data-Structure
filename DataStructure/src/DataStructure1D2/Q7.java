package DataStructure1D2;

import java.util.Scanner;

public class Q7 {
//n이 7이면 1+2+3+4+5+6+7 =28 로 출력하는 프로그램을 작성하세요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 값을 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i < n)
				System.out.print(i + "+");
			else
				System.out.print(n);
			sum += i;
		}
		System.out.print("=" + sum);

	}
}
