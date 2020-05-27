package Exception;

public class trycatch {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("숫자로 변환 할 수 없습니다");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}

}
