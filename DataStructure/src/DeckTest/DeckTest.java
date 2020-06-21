package DeckTest;

import QueueTest.IntQueue.OverflowIntQueueException;

public class DeckTest {
	private int max; // ���� �뷮
	private int front; // ù��° ��� Ŀ��
	private int rear; // ������ ��� Ŀ��
	private int[] deck;// �� ��ü
	private int num; // ���� ������ ��

	// ���� �� ���� : ���� �������
	public class EmptyIntDeckException extends RuntimeException {
	}

	// ���� �� ���� : ���� �� ��
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

	// ���� �����͸� �Ӹ����� ��ť
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
