package Array1;

import java.util.Scanner;

public class CardConvRev2 {
	static int CardConvrev(int x, int r, char c[]) {
		int index = 0;
		String j = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			c[index++] = j.charAt(x % r);
			x = x / r;
		} while (x != 0); // x �� 0�� �ɋ����� �ݺ��϶�.
		return index;
	}

	public static void main(String[] args) {
		int x; // ������ �ƴ� ����
		int r; // ��� ��ȯ ex)2���� 8 16 32
		char c[] = new char[32]; // �迭
		int index; // �ڸ��� ���� ��
		int retry; // �����Ұ��� ������ ���� .
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.print("������ �ƴ� �������� �Է��ϼ���");
				x = sc.nextInt();
			} while (x < 0);
			do {
				System.out.print("�����ȯ�� ��  ������ �Է��ϼ��� (2~36)");
				r = sc.nextInt();
			} while (r < 2 || r > 36);

			index = CardConvrev(x, r, c);

			for (int i = index - 1; i >= 0; i--) {
				System.out.print(c[i]);
			}
			System.out.println("���α׷��� �����Ͻǲ��ϱ�? ��(1),�ƴϿ�(0)");
			retry = sc.nextInt();
		} while (retry != 1);
	}
}
