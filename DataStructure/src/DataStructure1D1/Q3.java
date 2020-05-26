package DataStructure1D1;

public class Q3 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}
	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}
	static int min4(int a, int b, int c, int d) { 
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}
	public static void main(String[] args) {
		// 네 값의 최댓값을 구하는 max4메소드를 작성하세요.
		System.out.println("max4(1, 2, 3, 4) : " + max4(1, 2, 3, 4));
		// 세 값의 최소값을 구하는 min3메소드를 작성하세요.
		int min3 = min3(8, 5, 6);
		System.out.println(min3);
		// 네 값의 최솟값을 구하는 min4메소드를 작성하세요.
		System.out.println("min4(8,9,12,11) : " + min4(8, 9, 12, 11));
	}

}
