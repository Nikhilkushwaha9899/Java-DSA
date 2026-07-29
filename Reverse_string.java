import java.util.*;

public class Reverse_string {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Reverse_string rs = new Reverse_string();
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        rs.reverseString(s);
    }
}
