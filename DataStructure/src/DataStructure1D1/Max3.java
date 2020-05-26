package DataStructure1D1;

public class Max3 {
	static int max3(int a, int b, int c) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}

	public static void main(String[] args) {
		//들어갈 수 있는 모든 경우의 수를 넣어보자 
		System.out.println("max3(3,2,1)" + max3(3,2,1));//a>b>c
		System.out.println("max3(3,2,2)" + max3(3,2,2));//a>b=c
		System.out.println("max3(3,1,2)" + max3(3,1,2));//a>c>b
		System.out.println("max3(3,2,3)" + max3(3,2,3));//a=c>b
		System.out.println("max3(2,1,3)" + max3(2,1,3));//c>a>b
		System.out.println("max3(3,3,2)" + max3(3,3,2));//a=b>c
		System.out.println("max3(3,3,3)" + max3(3,3,3));//a=b=c
		System.out.println("max3(2,3,1)" + max3(2,3,1));//b>a>c
		System.out.println("max3(2,1,1)" + max3(2,1,1));//b>a=c
		System.out.println("max3(1,3,2)" + max3(1,3,2));//b>c>a
		System.out.println("max3(1,3,3)" + max3(1,3,3));//b=c>a
		System.out.println("max3(1,2,3)" + max3(1,2,3));//c>b>a
	}

}
