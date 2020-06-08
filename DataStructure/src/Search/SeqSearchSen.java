package Search;

import java.util.Scanner;

public class SeqSearchSen { // 보초법
	static int seqSearchSen(int[] a, int num, int key) {
		int i = 0;
		a[num] = key; // 배열의 마지막 요소에 key값을 대입 ==보초법
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == num ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟 수 : ");

		int num = sc.nextInt();

		int[] a = new int[num + 1];
		for (int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.println("검색할 값 : ");
		int key = sc.nextInt();
		int index = seqSearchSen(a, num, key);
		if (index == -1)
			System.out.println("그 값의 요소가 없습니다");
		else
			System.out.println(key + "는 x[" + index + "] 에 있습니다");
	}

}
