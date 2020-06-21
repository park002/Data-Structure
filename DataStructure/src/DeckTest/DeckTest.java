package DeckTest;

import QueueTest.IntQueue.OverflowIntQueueException;

public class DeckTest {
	private int max; // 덱의 용량
	private int front; // 첫번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int[] deck;// 덱 본체
	private int num; // 현재 데이터 수

	// 실행 시 예외 : 덱이 비어있음
	public class EmptyIntDeckException extends RuntimeException {
	}

	// 실행 시 예외 : 덱이 꽉 참
	public class OverflowIntDeckExcepiton extends RuntimeException {
	}

	public DeckTest(int capacity) {
		max = capacity;
		try {
			deck = new int[max];
		} catch (OutOfMemoryError e) {
			// TODO: handle exception
			max = 0;

		}

	}

	// 덱에 데이터를 머리부터 인큐
	public int enqueFront(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntDeckExcepiton();
		num++;
		if (--front < 0)
			front = max - 1;
		deck[front] = x;
		return x;

	}

}
