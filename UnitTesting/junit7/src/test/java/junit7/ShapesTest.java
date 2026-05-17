<<<<<<< HEAD
package junit7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes sh=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertNotEquals(491.0,sh.computeSquareArea(7));
	}
	@Test
	void testComputeSquareArea_withMessage() {
		assertNotEquals(49.0,sh.computeSquareArea(7),"test case failed");
	}
	@Test
	void testComputeSquareArea_supplier() {
		assertNotEquals(49.0,sh.computeSquareArea(7),()->"test case failed");
	}

}
=======
package junit7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {
	Shapes sh=new Shapes();
	@Test
	void testComputeSquareArea() {
		assertNotEquals(491.0,sh.computeSquareArea(7));
	}
	@Test
	void testComputeSquareArea_withMessage() {
		assertNotEquals(49.0,sh.computeSquareArea(7),"test case failed");
	}
	@Test
	void testComputeSquareArea_supplier() {
		assertNotEquals(49.0,sh.computeSquareArea(7),()->"test case failed");
	}

}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960
