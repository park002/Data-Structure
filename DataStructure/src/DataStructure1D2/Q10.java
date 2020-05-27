package DataStructure1D2;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값");
		int a = sc.nextInt();
		int b;

		do {
			System.out.print("b의 값");
			b = sc.nextInt();
			if (b <= a)
				System.out.println("a보다 큰 값을 입력하세요!");
		} while (b <= a);

		System.out.print("b-a는 ");
		System.out.printf("%d", b - a);
		System.out.print(" 입니다");
	}
}
