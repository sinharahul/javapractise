package datastructures;

public class ArrayList<E> implements List<E> {
	private E[] arr;
	private int CAPACITY = 1;
	private int currentPos = 0;

	public ArrayList() {
		super();
		this.arr = (E[]) new Object[CAPACITY];
	}

	public ArrayList(int capacity) {
		super();
		this.arr = (E[]) new Object[capacity];
		this.CAPACITY = capacity;
	}

	@Override
	// 1 2 3 4
	// 0 1 2 3
	public boolean insert(E e, int i) {
		if (i > CAPACITY-1) {
			throw new IllegalArgumentException(" index " + i
					+ " is outofbounds");
		}
		if (currentPos + 1 > CAPACITY) {
			resizeArray();
		}

		for (int j = currentPos + 1; j < i; j--) {
			arr[j] = arr[j - 1];
		}
		arr[i] = e;
		currentPos++;
		return true;

	}

	private void resizeArray() {
		CAPACITY = 2 * CAPACITY;
		E[] old = arr;
		arr = (E[]) new Object[CAPACITY];
		for (int i = 0; i < old.length; i++) {
			arr[i] = old[i];
		}
		old = null;
	}

	@Override
	public boolean append(E e) {
		boolean flag = insert(e, currentPos);
		return flag;
	}

	@Override
	public E get(int i) {
		return arr[i];
	}

	@Override
	public void clear() {
		arr = (E[]) new Object[CAPACITY];

	}

	@Override
	public int size() {	
		return currentPos+1;
	}

}
