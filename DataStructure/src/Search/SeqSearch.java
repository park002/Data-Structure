package Search;

import java.util.Scanner;

public class SeqSearch {
	static int Search(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < a.length; i++) {
			System.out.print("x[" + i + "] :");
			a[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		if (Search(a, key) != -1) {
			System.out.println("검색할 값 : " + key + "은(는) \t" + "a[" + Search(a, key) + "] 에 존재 합니다.");
		} else {
			System.out.println("그 값의 요소가 없습니다");
		}
	}
}
