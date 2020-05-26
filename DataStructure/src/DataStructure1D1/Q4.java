package DataStructure1D1;

public class Q4 {

	static int med3(int a, int b, int c) {
		if (a >= b) { // a>=b
			if (b >= c) { // b>=c
				return b;
			} else if (c >= a) { // a>=b b<=c c>a>b
				return a;
			} else
				return c; // a>=b b<=c a>=c a>c>b
		} else if (a > c) { // b>a>c
			return a;
		} else if (c > b) { // a<=b a<c --> c>b>a
			return b;
		} else // a<=b a<c c<b b>c>a
			return c;
	}

	public static void main(String[] args) {
		// 13종류의 모든 조합에 대해 중앙 값을 구하시오
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
