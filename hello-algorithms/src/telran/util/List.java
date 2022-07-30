package telran.util;

public interface List<T> extends Collection<T> {
	boolean add(int index, T obj);
	T remove(int index);
	int indexOf(Object pattern);
	int lastIndexOf(Object pattern);
	Integer get(int index);
	
}
