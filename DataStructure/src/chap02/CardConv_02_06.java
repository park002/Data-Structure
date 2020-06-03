package chap02;
import java.util.Scanner;
// ?��?�� 받�? 10진수�? 2진수 ~36진수�? 기수�??��?��?�� ?��???��(?��?��리�??�� 배열?�� ???��)

class CardConv_02_06 {
	// ?��?�� x�? r진수�? �??��?��?�� 배열 d?�� ?��?��리�??�� ???��?���? ?��릿수�? 반환
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;// �??�� ?��?�� ?��릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // r�? ?��?�� ?��머�?�? ???��
			x /= r;
		} while (x != 0);

		for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
			char temp = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = temp;
		}
		return digits;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; // �??��?��?�� ?��?��
		int cd; // 기수
		int dno; // �??�� ?��?�� ?��릿수
		int retry; // ?�� �? ?��?
		char[] cno = new char[32]; // �??�� ?��?�� �? ?��리�?? ???��?��?�� 문자?�� 배열

		System.out.println("10진수�? 기수�??��?��?��?��.");
		do {
			do {
				System.out.print("�??��?��?�� ?��?�� ?��?�� ?��?���?");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("?��?�� 진수�? �??��?��까요? (2~36)�?");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno); // no�? cd진수�? �??��

			System.out.print(cd + "진수로는 ");
			for (int i = 0; i < dno; i++) // ?��?��리�??�� 차�?�? ?��???��
				System.out.print(cno[i]);
			System.out.println("?��?��?��.");

			System.out.print("?���? ?�� ?��까요? (1.?��/0.?��?��?��)�?");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
