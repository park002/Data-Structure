package Array2;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				count++;// 1
				if (n % i == 0) // 나누어 떨어진다면 그 수는 소수가 아니라는 것.
					break;
			}
			if (n == i) // 마지막까지 나누어 떨어지지 않았을 경우 그 수는 소수라는 것.
				System.out.println(n);
		}
		System.out.println("나눈 횟수 : " + count);
	}
}
