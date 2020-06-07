package ClassTest;

public class Test1 {
	private static int f1;
	protected int f2;
	public int f3;

	static final int S1 = 0; // 적정 상수 필드

	public Test1() {
		f1 = f2 = f3 = 3;
	}

	public Test1(int f1, int f2, int f3) {
		// 생성자 오버로딩
		this.f1 = f1;
		this.f2 = f2;
		this.f3 = f3;
	}

	public void setF1(int f) {
		f1 = f;
	}

	public static int getF1() {
		return f1;
	}

	public static void main(String[] args) {
		System.out.println(getF1());

	}
}
