package Exception;

public class TryCatchFEx {
	

	public static void main(String[] args) {
		String[] abc = { "10", "a1" };
		int value = 0;
		for (int i = 0; i <= abc.length; i++) {
			try {
				value = Integer.parseInt(abc[i]);
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			} finally {
				System.out.println(value);
			}
		}
	}
}
