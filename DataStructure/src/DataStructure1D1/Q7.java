package DataStructure1D1;

public class Q7 {

	static int med(int a, int b, int c) {
		
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}
}
