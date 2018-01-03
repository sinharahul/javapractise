package datastructures;

public interface List<E> {
	
    public boolean insert(E e,int i);
    public boolean append(E e);
    public E get(int i);
    public void clear();
    
}
