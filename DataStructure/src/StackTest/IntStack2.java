package StackTest;

import java.util.Scanner;

public class IntStack2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		IntStack s = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택
		while (true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 :");
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터 : ");
				x = sc.nextInt();
				try {
					s.push(x);

				} catch (IntStack.OverflowIntStackException e) {
					// 객체 생성 후 사용 가능
					System.out.println("스택이 가득 찼습니다");
					// TODO: handle exception
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("pop 한 데이터는 : " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					// TODO: handle exception
					System.out.println("스택이 비었습니다");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 : " + x + "입니다");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
					// TODO: handle exception
				}
				break;
			case 4: // 덤프
				s.dump();
				break;
			}
		}
	}
}
