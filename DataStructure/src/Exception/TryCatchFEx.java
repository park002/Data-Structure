package Exception;

public class TryCatchFEx {
	

	public static void main(String[] args) {
		String[] abc = { "10", "a1" };
		int value = 0;
		for (int i = 0; i <= abc.length; i++) {
			try {
				value = Integer.parseInt(abc[i]);
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε��� �ʰ�");
			} finally {
				System.out.println(value);
			}
		}
	}
}
