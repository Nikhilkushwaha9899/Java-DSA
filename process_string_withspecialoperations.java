import java.util.*;
public class process_string_withspecialoperations {
    public String processStr(String s) {
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
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        process_string_withspecialoperations t = new process_string_withspecialoperations();
        String s = sc.nextLine();
        System.out.println(t.processStr(s));
    }
}
