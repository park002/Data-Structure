package DataStructure1D2;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��� ������ �Է��ϼ���");
		int n;
		do {
			System.out.print("�Է� : ");
			n = sc.nextInt();
		} while (!(n >= 10 && n <= 99));

		System.out.println("���� n �� ����" + n + "��(��)�Ǿ����ϴ�");

	}
}
