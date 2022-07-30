package telran.util.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.Collection;

abstract class CollectionTests {
	protected Collection<Integer> collection;
	protected abstract Collection<Integer> createCollection();

	@BeforeEach
	void setUp() throws Exception {
		collection = createCollection();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
