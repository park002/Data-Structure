package DataStructure1D2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n;
		int count = 0;

		do {
			System.out.println("���� ������ �Է��ϼ���");
			n = sc.nextInt();
		} while (n <= 0);

		while (n > 0) { // 100 10
			n /= 10;// 10 1 0
			count++;// 1 2 3
		}
		System.out.printf("�� ���� %d�ڸ� �Դϴ�", count);

	}
}
