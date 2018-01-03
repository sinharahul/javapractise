package datastructures;

public class ArrayList<E> implements List<E> {
	private E[] arr;
	private int CAPACITY = 1;
	private int currentPos = 0;

	public ArrayList() {
		super();
		this.arr = (E[]) new Object[currentPos];
	}

	@Override
	public boolean insert(E e, int i) {
		if (currentPos + 1 > CAPACITY) {
              resizeArray();
		}

		currentPos++;
		for (int j = i + 1; j < currentPos; j++) {
			arr[j] = arr[j - 1];
		}
		arr[i] = e;
		return true;

	}

	private void resizeArray() {
		CAPACITY = 2 * CAPACITY;
		E[] old = arr;
		arr = (E[]) new Object[CAPACITY];
		for(int i = 0; i< old.length;i++){
			arr[i] = old[i];
		}
		old = null;
	}

	@Override
	public boolean append(E e) {
		return insert(e,currentPos+1);
		
	}

	@Override
	public E get(int i) {
		return arr[i];
	}

	@Override
	public void clear() {
		arr = (E[])new Object[CAPACITY];

	}

}
