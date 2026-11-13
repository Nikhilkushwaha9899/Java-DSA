public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < s.length() && ptr2 < t.length()) {
            if (s.charAt(ptr1) == t.charAt(ptr2)) {
                ptr1++;
            }
            ptr2++;
        }
        return ptr1 == s.length();
    }

    public static void main(String[] args) {
        Is_Subsequence is = new Is_Subsequence();
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(is.isSubsequence(s, t));
    }
}
