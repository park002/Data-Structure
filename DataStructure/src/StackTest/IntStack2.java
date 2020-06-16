package StackTest;

import java.util.Scanner;

public class IntStack2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64); // �ִ� 64���� Ǫ���� �� �ִ� ����
		while (true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.print("(1)Ǫ�� (2)�� (3)��ũ (4)���� (0)���� :");
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			
			switch (menu) {
			case 1:
				System.out.print("������ : ");
				x = sc.nextInt();
				try {
					s.push(x);

				} catch (IntStack.OverflowIntStackException e) {
					// ��ü ���� �� ��� ����
					System.out.println("������ ���� á���ϴ�");
					// TODO: handle exception
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("pop �� �����ʹ� : " + x + "�Դϴ�.");
				} catch (IntStack.EmptyIntStackException e) {
					// TODO: handle exception
					System.out.println("������ ������ϴ�");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� : " + x + "�Դϴ�");
				} catch (IntStack.EmptyIntStackException e) {
					
					System.out.println("������ ��� �ֽ��ϴ�.");
					// TODO: handle exception
				}
				break;
			case 4: // ����
				s.dump();
				break;
			}
		}
	}
}
