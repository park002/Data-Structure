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
		// �� ���� �ִ��� ���ϴ� max4�޼ҵ带 �ۼ��ϼ���.
		System.out.println("max4(1, 2, 3, 4) : " + max4(1, 2, 3, 4));
		// �� ���� �ּҰ��� ���ϴ� min3�޼ҵ带 �ۼ��ϼ���.
		int min3 = min3(8, 5, 6);
		System.out.println(min3);
		// �� ���� �ּڰ��� ���ϴ� min4�޼ҵ带 �ۼ��ϼ���.
		System.out.println("min4(8,9,12,11) : " + min4(8, 9, 12, 11));
	}

}
