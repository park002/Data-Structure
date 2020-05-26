package DataStructure1D1;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 0)
			System.out.println("이 수는 양수입니다");
		else if (n < 0)
			System.out.println("이 수는 음수 입니다");
		else
			System.out.println("이 수는 0입니다");
	}

}
