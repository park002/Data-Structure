package DataStructure1D1;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ �ִ��� ���մϴ�");
		System.out.print("a�� �� :");
		int a = sc.nextInt();
		System.out.print("b�� �� :");
		int b = sc.nextInt();
		System.out.print("c�� �� :");
		int c = sc.nextInt();
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println("�ִ��� :" + max + "�Դϴ�");
	}
}
