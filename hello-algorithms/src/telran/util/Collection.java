package telran.util;

import java.util.Iterator;
import java.util.function.Predicate;

public interface Collection<T> extends Iterable<T> {
	boolean add(T obj);
	boolean remove(Object pattern);
	boolean removeIf(Predicate<T> predicate);
	boolean contains(Object predicate);
	int size();
	default T[] toArray(T[] arr) {
		Iterator<T> it = iterator();
		return null;
	}
}
