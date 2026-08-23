import java.util.*;
public class Binary_Alt_bits {
    public boolean hasAlternatingBits(int n) {
		String s = Integer.toBinaryString(n);
		int ptr1 = 0;
		int ptr2 = 1;
		while (ptr2 < s.length()) {
			if (s.charAt(ptr1) == s.charAt(ptr2)) {
				return false;
			} else {
				ptr1++;
				ptr2++;
			}
		}
		return true;
	}
    public static void main(String[] args) {
        int n = 170;
		Binary_Alt_bits bab=new Binary_Alt_bits();
		System.out.println(bab.hasAlternatingBits(n));
    }
}
