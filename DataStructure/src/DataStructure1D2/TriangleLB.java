package DataStructure1D2;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		System.out.println("���ʾƷ��� ������ �̵ �ﰢ���� ����մϴ�");
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("�� �� �ﰢ���Դϱ�?");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
