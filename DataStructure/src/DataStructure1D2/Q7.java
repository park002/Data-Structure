package DataStructure1D2;

import java.util.Scanner;

public class Q7 {
//n�� 7�̸� 1+2+3+4+5+6+7 =28 �� ����ϴ� ���α׷��� �ۼ��ϼ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� ���� �Է��ϼ���");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
