package DataStructure1D2;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		// 1���� 10 ������ ���� (1+10)*5 �� ���� ������� ���� �� �ִ� . ���콺�� �����̶�� ����� �̿��Ͽ� 1���� n ������ ����
		// ����
		// ���ϴ� ���α׷��� �ۼ��϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("n ���� �Է��ϼ���");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = n * (1 + n) / 2;
		}
		System.out.println("sum=" + sum);
	}

}
