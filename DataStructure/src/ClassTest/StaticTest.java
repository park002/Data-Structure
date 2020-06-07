package ClassTest;

public class StaticTest {
	private static int like;

	static int like() {
		return ++like;
	}

	public static void main(String[] args) {
		// 인스턴스가 생성되면 서로 독립적으로 다른 값을 갖는다. 경우에 따라서는 인스턴스는 서로 같은 값을 유지 되어야 하는 경우, 그때
		// static을 사용한다
		// static 을 사용하게 될 경우 자바는 메모리 할당을 한번만 한 후 그 메모리 주소만을 바라보게된다.
		System.out.println(like());
		System.out.println(like());
	}
}
