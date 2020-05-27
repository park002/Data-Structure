package Exception;

public class Throws {
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}

	static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang");
	}
}
