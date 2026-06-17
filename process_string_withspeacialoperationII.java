import java.util.*;
public class process_string_withspeacialoperationII {
     public char processStr(String s,long k) {
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '*') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else if (ch == '#') {
                result.append(result.toString());
            } else if (ch == '%') {
                result.reverse();
            } else {
                result.append(ch);
            }
        }
    if (k >= 0 && k < result.length()) {
        return result.charAt((int)k);
    }
    return '.';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        process_string_withspeacialoperationII t = new process_string_withspeacialoperationII();
        String s = sc.nextLine();
        int k=sc.nextInt();
        System.out.println(t.processStr(s,k));
    }
}
