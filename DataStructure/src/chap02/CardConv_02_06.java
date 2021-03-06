package chap02;
import java.util.Scanner;
// ?? ₯ λ°μ? 10μ§μλ₯? 2μ§μ ~36μ§μλ‘? κΈ°μλ³????¬ ????(??λ¦¬λ??° λ°°μ΄? ???₯)

class CardConv_02_06 {
	// ? ? xλ₯? rμ§μλ‘? λ³????¬ λ°°μ΄ d? ??λ¦¬λ??° ???₯?κ³? ?λ¦Ώμλ₯? λ°ν
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;// λ³?? ?€? ?λ¦Ώμ
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // rλ‘? ?? ?λ¨Έμ?λ₯? ???₯
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
		int no; // λ³???? ? ?
		int cd; // κΈ°μ
		int dno; // λ³?? ?€? ?λ¦Ώμ
		int retry; // ? λ²? ??
		char[] cno = new char[32]; // λ³?? ?€? κ°? ?λ¦¬λ?? ???₯?? λ¬Έμ?Έ λ°°μ΄

		System.out.println("10μ§μλ₯? κΈ°μλ³???©??€.");
		do {
			do {
				System.out.print("λ³???? ??΄ ?? ? ?οΌ?");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("?΄?€ μ§μλ‘? λ³??? κΉμ? (2~36)οΌ?");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno); // noλ₯? cdμ§μλ‘? λ³??

			System.out.print(cd + "μ§μλ‘λ ");
			for (int i = 0; i < dno; i++) // ??λ¦¬λ??° μ°¨λ?λ‘? ????
				System.out.print(cno[i]);
			System.out.println("???€.");

			System.out.print("?λ²? ? ? κΉμ? (1.?/0.???€)οΌ?");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
