package DataStructure1D2;

import java.util.Scanner;

public class SumFor {
//1���� n ������ ���� ���մϴ� 
	// n�� �� :5
	// 1���� 5������ ���� 15�Դϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� ���� �Է��ϼ���");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println("1���� " + n + "������ ����" + sum + "�Դϴ�");
	}
}
