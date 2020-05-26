package DataStructure1D2;

public class Q9 {
	// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메소드를 작성하세요
	static int sumof(int a, int b) { // 1 4
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumof(1, 4)); // 1+2+3+4 --> 10
		System.out.println(sumof(5, 10)); // 5 6 7 8 9 10 --> 45
	}
}
