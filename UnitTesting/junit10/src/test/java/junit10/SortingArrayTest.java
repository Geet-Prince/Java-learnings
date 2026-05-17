<<<<<<< HEAD
package junit10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void test() {
		try {
			SortingArray sa=new SortingArray();
			int unsorted[]= {1,2,3,5,4,6,9,8};
			int sorted[]=sa.sortingArray(unsorted);
			for(int sor:sorted) {
				System.out.print(sor);
				}
			fail();
			}
		catch(NullPointerException e) {
			System.out.print("Exception generated");
		}
	}

}
=======
package junit10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void test() {
		try {
			SortingArray sa=new SortingArray();
			int unsorted[]= {1,2,3,5,4,6,9,8};
			int sorted[]=sa.sortingArray(unsorted);
			for(int sor:sorted) {
				System.out.print(sor);
				}
			fail();
			}
		catch(NullPointerException e) {
			System.out.print("Exception generated");
		}
	}

}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960
