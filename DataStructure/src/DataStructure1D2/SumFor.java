package DataStructure1D2;

import java.util.Scanner;

public class SumFor {
//1부터 n 까지의 합을 구합니다 
	// n의 값 :5
	// 1부터 5까지의 합은 15입니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 값을 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 합은" + sum + "입니다");
	}
}
