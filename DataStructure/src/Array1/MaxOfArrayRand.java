package Array1;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) { // �ִ��� ���ϴ� �޼ҵ�
		int max;
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Ű�� �ִ��� ���մϴ�");
		System.out.println("��� �� : ");
		int num = 1 + rand.nextInt(5); //1���� 5���� n-1���� 
		int[] height = new int[num];

		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] =" + height[i]);
		}
		System.out.println("�ִ��� : " + maxOf(height) + "�Դϴ�");
	
	}
}
