package StackTest;

public class IntStack {
	private int max; // 스택 용량
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체

	public class EmptyIntStackException extends RuntimeException { // 실행 시 예외 : 스택이 비어 있음.
		public EmptyIntStackException() {// 인스턴스 멤버 클래스 객체 생성 후 사용가능
		}
	}

	public class OverflowIntStackException extends RuntimeException { // 실행 시 예외 : 스택이 가득참
		public OverflowIntStackException() {// 인스턴스 멤버 클래스 객체 생성 후 사용가능
		}
	}

	// 생성자
	public IntStack(int capacity) { // 64
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			// TODO: handle exception
			max = 0;
		}
	}

	public int push(int x) throws OverflowIntStackException {
		if (ptr == max) { // 스택이 가득 찼을 경우
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}

	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];

	}

	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}

	// 스택에서 x를 찾아 인덱스(없으면 -1) 반환.
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) { // 정상 쪽에서 선형검색
			if (stk[i] == x) {
				return i; // 검색 성공
			}
		}
		return -1; // 검색 실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환 하는 메소드
	public int capacity() {
		return max;
	}

	// 스택에 쌓여있는 데이터 수 반환
	public int size() {
		return ptr;
	}

	public boolean isEmpty() { // 스택이 비어 있는가?
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥-->꼭대기 순서로 출력
	public void dump() {
		if (ptr <= 0) {
			System.out.println("스택이 비어있습니다");
		} else {
			for (int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
	}
}
