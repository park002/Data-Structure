package DataStructure1D2;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		System.out.println("�簢���� ����մϴ�.");
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ��:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
