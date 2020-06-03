package Array1;

import java.util.Scanner;

public class CardConvRev {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.print(r + "|\t\t" + x + "\n +------------");
		System.out.println();
		do {
			d[digits++] = dchar.charAt(x % r); // 59%2 , 29%2, 14%2, 7%2 3%2
			System.out.print(r + "|\t\t" + x / r + " ..." + (x % r) + "\n +------------");
			System.out.println();
			x /= r;
		} while (x != 0);
		for (int i = 0; i < digits / 2; i++) {
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}
	public static void main(String[] args) {
		int no; // ��ȯ�Ǵ� ���� ex) 752, 56
		int cd; // ��� 2����,16����,8����,32����
		int dno; // cardConvR( ) ������ -->��ȯ ���� �ڸ���
		int retry; // �ٽ� �ѹ� ?
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		Scanner sc = new Scanner(System.in);
		System.out.println("10������ ��� ��ȯ �մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ����� :");
				no = sc.nextInt(); // 59
			} while (no < 0);
			do {
				System.out.print("� ������ ��ȯ�ұ�� ? (2~36) :");
				cd = sc.nextInt(); // 2

			} while (cd < 2 || cd > 36);

			dno = cardConvR(no, cd, cno);
			System.out.print(cd + "������ ");
			for (int i = 0; i < dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			System.out.print("�ѹ� �� �� ���? (1.�� 0.�ƴϿ�) :");
			retry = sc.nextInt();
		} while (retry == 1);

	}
}
