package chap02;
import java.util.Scanner;
// ?…? ¥ ë°›ì? 10ì§„ìˆ˜ë¥? 2ì§„ìˆ˜ ~36ì§„ìˆ˜ë¡? ê¸°ìˆ˜ë³??™˜?•˜?—¬ ?‚˜???ƒ„(?œ—?ë¦¬ë??„° ë°°ì—´?— ???¥)

class CardConv_02_06 {
	// ? •?ˆ˜ xë¥? rì§„ìˆ˜ë¡? ë³??™˜?•˜?—¬ ë°°ì—´ d?— ?œ—?ë¦¬ë??„° ???¥?•˜ê³? ?ë¦¿ìˆ˜ë¥? ë°˜í™˜
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;// ë³??™˜ ?’¤?˜ ?ë¦¿ìˆ˜
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r); // rë¡? ?‚˜?ˆˆ ?‚˜ë¨¸ì?ë¥? ???¥
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
		int no; // ë³??™˜?•˜?Š” ? •?ˆ˜
		int cd; // ê¸°ìˆ˜
		int dno; // ë³??™˜ ?’¤?˜ ?ë¦¿ìˆ˜
		int retry; // ?•œ ë²? ?”?
		char[] cno = new char[32]; // ë³??™˜ ?’¤?˜ ê°? ?ë¦¬ë?? ???¥?•˜?Š” ë¬¸ì?¸ ë°°ì—´

		System.out.println("10ì§„ìˆ˜ë¥? ê¸°ìˆ˜ë³??™˜?•©?‹ˆ?‹¤.");
		do {
			do {
				System.out.print("ë³??™˜?•˜?Š” ?Œ?´ ?•„?‹Œ ? •?ˆ˜ï¼?");
				no = stdIn.nextInt();
			} while (no < 0);

			do {
				System.out.print("?–´?–¤ ì§„ìˆ˜ë¡? ë³??™˜?• ê¹Œìš”? (2~36)ï¼?");
				cd = stdIn.nextInt();
			} while (cd < 2 || cd > 36);

			dno = cardConv(no, cd, cno); // noë¥? cdì§„ìˆ˜ë¡? ë³??™˜

			System.out.print(cd + "ì§„ìˆ˜ë¡œëŠ” ");
			for (int i = 0; i < dno; i++) // ?œ—?ë¦¬ë??„° ì°¨ë?ë¡? ?‚˜???ƒ„
				System.out.print(cno[i]);
			System.out.println("?…?‹ˆ?‹¤.");

			System.out.print("?•œë²? ?” ?• ê¹Œìš”? (1.?˜ˆ/0.?•„?‹ˆ?˜¤)ï¼?");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
