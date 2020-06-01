package Array1;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	static int maxOf(int[] a) { // 최댓값을 구하는 메소드
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
		System.out.println("키의 최댓값을 구합니다");
		System.out.println("사람 수 : ");
		int num = 1 + rand.nextInt(5); //1부터 5까지 n-1까지 
		int[] height = new int[num];

		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] =" + height[i]);
		}
		System.out.println("최댓값은 : " + maxOf(height) + "입니다");
	
	}
}
