package Exception;

public class trycatch {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		} catch (Exception e) {
			System.out.println("���ڷ� ��ȯ �� �� �����ϴ�");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
