package DataStructure1D2;

public class Q9 {
	// ���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �Ʒ� �޼ҵ带 �ۼ��ϼ���
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
