package QueueTest;

import java.util.Scanner;

public class IntQueueTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(5); // ť �迭 ���� 64
		while (true) {
			System.out.println("���� �����ͼ� :" + s.size() + "/" + s.capacity());
			System.out.print("(1)��ť (2)��ť (3)��ũ (4)���� (0)���� :");
			int menu = sc.nextInt();

			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.println("������ :");
				x = sc.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					// TODO: handle exception
					System.out.println("ť�� �� á���ϴ�");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					// TODO: handle exception
					System.out.println("ť�� ������ϴ�");
				}
				break;
			case 3:
				try {
					System.out.println("��ũ�� �����ʹ� " + s.peek() + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					// TODO: handle exception
					System.out.println("ť�� ������ϴ�");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}

	}
}
