package DataStructure1D2;

import java.util.Scanner;

public class Q15 {
	static void triangleB(int n) { // ���� �Ʒ��� ������ �̵ �ﰢ���� ���
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}

	static void triangleLU(int n) { // ���� ���� ������ �̵ �ﰢ���� ����մϴ�
		for (int i = 1; i <= n; i++) {
			for (int j = n; i <= j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}

	static void triangleRU(int n) { // ������ ���� ������ �̵ �ﰢ���� ����մϴ�
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	static void triangleRB(int n) { // ������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
		System.out.println("�� �� �ﰢ���Դϱ�?");
		triangleB(sc.nextInt());

		System.out.println("���� ���� ������ �̵ �ﰢ���� ����մϴ�");
		System.out.println("�� �� �ﰢ���Դϱ�?");
		triangleLU(sc.nextInt());

		System.out.println("������ ���� ������ �̵ �ﰢ���� ����մϴ�");
		System.out.println("�� �� �ﰢ���Դϱ�?");
		triangleRU(sc.nextInt());

		System.out.println("������ �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�");
		System.out.println("�� �� �ﰢ���Դϱ�?");
		triangleRB(sc.nextInt());

	}
}
