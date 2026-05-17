<<<<<<< HEAD
package junit9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTesting {

	@Test
	void test() {
		int expected[]= {1,2,3,4,5,6};
		int actual[]= {1,6,3,4,5,2};
		Arrays.sort(actual);
		assertArrayEquals(actual,expected);
	}

}
=======
package junit9;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArrayTesting {

	@Test
	void test() {
		int expected[]= {1,2,3,4,5,6};
		int actual[]= {1,6,3,4,5,2};
		Arrays.sort(actual);
		assertArrayEquals(actual,expected);
	}

}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960
