package DataStructure1D2;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		// 1부터 n 까지 정수의 합 구하기
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 값을 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
			System.out.println("i 값 : " + i + "\t n 값 :" + n);
		}
		System.out.println("1부터 n 까지의 합 : " + sum);
	}
}
