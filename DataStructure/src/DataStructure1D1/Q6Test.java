package DataStructure1D1;

public class Q6Test {
	static int med3(int a, int b, int c) {
		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (c >= a) {
				return a;
			} else
				return c;
		} else if (a > c) {
			return a;
		} else if (b > c) {
			return c;
		} else
			return b;
	}

	public static void main(String[] args) {
		System.out.println("a>b>c :" + med3(3, 2, 1));// a>b>c
		System.out.println("a>b=c :" + med3(3, 2, 2));// a>b=c
		System.out.println("a>c>b :" + med3(3, 1, 2));// a>c>b
		System.out.println("a=c>b :" + med3(3, 1, 3));// a=c>b
		System.out.println("c>a>b :" + med3(2, 1, 3));// c>a>b
		System.out.println("a=b>c :" + med3(3, 3, 1));// a=b>c
		System.out.println("a=b=c :" + med3(3, 3, 3));// a=b=c
		System.out.println("b>a>c :" + med3(2, 3, 1));// b>a>c
		System.out.println("b>a=c :" + med3(2, 3, 2));// b>a=c
		System.out.println("b>c>a :" + med3(1, 3, 2));// b>c>a
		System.out.println("b=c>a :" + med3(1, 2, 2));// b=c>a
		System.out.println("c>b>a :" + med3(1, 2, 3));// c>b>a
		System.out.println("c>a=b :" + med3(2, 2, 3));// c>a=b
	}
}
