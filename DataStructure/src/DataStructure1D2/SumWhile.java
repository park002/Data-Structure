package DataStructure1D2;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		// 1���� n ���� ������ �� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� ���� �Է��ϼ���");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
			System.out.println("i �� : " + i + "\t n �� :" + n);
		}
		System.out.println("1���� n ������ �� : " + sum);
	}
}
