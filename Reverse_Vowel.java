import java.util.*;

public class Reverse_Vowel {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            while (l < r && !isVowel(arr[l])) {
                l++;
            }

            while (l < r && !isVowel(arr[r])) {
                r--;
            }

            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        s = new String(arr);
        return s;
    }

    public static void main(String[] args) {
        Reverse_Vowel rv = new Reverse_Vowel();
        String s = "LeetCode";
        System.out.println(rv.reverseVowels(s));
    }
}