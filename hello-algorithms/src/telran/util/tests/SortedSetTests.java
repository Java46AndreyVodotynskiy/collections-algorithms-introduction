package telran.util.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import telran.util.SortedSet;

public abstract class SortedSetTests extends SetTests {
	
	@Test
	@Override
	void toArrayTest() {
		Arrays.sort(expected);
		super.toArrayTest();
	}
	@Test
	void firstTest() {
		assertEquals((Integer)(-5), ((SortedSet<Integer>)collection).first());
	}
	@Test
	void lastTest() {
		assertEquals((Integer)(40), ((SortedSet<Integer>)collection).last());
	}
	
	@Test
	void ceillingTest() {
		assertEquals((Integer)40, ((SortedSet<Integer>)collection).ceilling(40));
		assertEquals((Integer)40, ((SortedSet<Integer>)collection).ceilling(35));
		assertEquals((Integer)15, ((SortedSet<Integer>)collection).ceilling(14));
		
		assertNull(((SortedSet<Integer>)collection).ceilling(41));
	}
	
	@Test
	void floorTest() {
		assertEquals((Integer)(-5), ((SortedSet<Integer>)collection).floor(-5));
		assertEquals((Integer)(-5), ((SortedSet<Integer>)collection).floor(0));
		assertNull(((SortedSet<Integer>)collection).floor(-6));
	}

}
