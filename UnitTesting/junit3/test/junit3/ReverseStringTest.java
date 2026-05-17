<<<<<<< HEAD
package junit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rev=new ReverseString();
		assertEquals("avaj",rev.reverseString("java"));
		assertEquals("ecnirP",rev.reverseString("Prince"));
	}

}
=======
package junit3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString rev=new ReverseString();
		assertEquals("avaj",rev.reverseString("java"));
		assertEquals("ecnirP",rev.reverseString("Prince"));
	}

}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960
