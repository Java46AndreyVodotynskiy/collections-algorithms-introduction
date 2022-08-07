package telran.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public interface Collection<T> extends Iterable<T> {
	boolean add(T obj);
	boolean remove(Object pattern);
	default boolean removeIf(Predicate<T> predicate) {
		int sizeOld = size();
		Iterator<T> it = iterator();
		while(it.hasNext()) {
			T obj = it.next();
			if(predicate.test(obj)) {
				remove(obj);
			}
		}
		return sizeOld > size();
	}
	boolean contains(Object predicate);
	int size();
	default T[] toArray(T[] ar) {
		//TODO

		// write the default method implementation based on the iterating
		Iterator<T> it = iterator();
		//TODO fill array by iterating 
		int size = size();
		if (ar.length < size) {
			ar = Arrays.copyOf(ar, size);
		} else if (ar.length > size) {
			for(int i = size; i < ar.length; i++) {
				ar[i] = null;
			}
		}
		int ind = 0;
		while(it.hasNext()) {
			ar[ind++] = it.next();
		}
		//if ar.length < size then you should create new array of type T with proper length(consider method Arrays.copyOf)
		//if ar.length == size then you just fill the given array and reference to the same array will be returned
		//if ar'length > size then you fill the given array and rest part should be filled by null's and 
		// reference to the same array will be returned
		return ar;
	}
}
