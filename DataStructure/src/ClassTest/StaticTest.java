package ClassTest;

public class StaticTest {
	private static int like;

	static int like() {
		return ++like;
	}

	public static void main(String[] args) {
		// �ν��Ͻ��� �����Ǹ� ���� ���������� �ٸ� ���� ���´�. ��쿡 ���󼭴� �ν��Ͻ��� ���� ���� ���� ���� �Ǿ�� �ϴ� ���, �׶�
		// static�� ����Ѵ�
		// static �� ����ϰ� �� ��� �ڹٴ� �޸� �Ҵ��� �ѹ��� �� �� �� �޸� �ּҸ��� �ٶ󺸰Եȴ�.
		System.out.println(like());
		System.out.println(like());
	}
}
