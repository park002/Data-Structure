package Array2;

public class PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		for (int n = 2; n <= 1000; n++) {
			int i;
			for (i = 2; i < n; i++) {
				count++;// 1
				if (n % i == 0) // ������ �������ٸ� �� ���� �Ҽ��� �ƴ϶�� ��.
					break;
			}
			if (n == i) // ���������� ������ �������� �ʾ��� ��� �� ���� �Ҽ���� ��.
				System.out.println(n);
		}
		System.out.println("���� Ƚ�� : " + count);
	}
}
