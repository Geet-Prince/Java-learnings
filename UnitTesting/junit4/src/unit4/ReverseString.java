<<<<<<< HEAD
package unit4;

public class ReverseString {
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray. length - 1;

		while (left < right) {
		char temp = charArray[left];
		charArray[left]= charArray[right];
		charArray[right] = temp;
		left++;
		right --;
		}
		return new String(charArray);

		}
}
=======
package unit4;

public class ReverseString {
	public String reverseString(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray. length - 1;

		while (left < right) {
		char temp = charArray[left];
		charArray[left]= charArray[right];
		charArray[right] = temp;
		left++;
		right --;
		}
		return new String(charArray);

		}
}
>>>>>>> e7229e4e012fdb6b1d47d4d1f5ed600e2e5b7960
