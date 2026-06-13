import java.util.Scanner;
public class String_to_int_atoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i == 0 && (ch == '-' || ch == '+')) {
                newString += ch;
            } else if (Character.isDigit(ch)) {
                newString += ch;
            } else {
                break;
            }
        }
        if (newString.equals("") || newString.equals("+") || newString.equals("-")) {
            return 0;
        }
        long number = Long.parseLong(newString);
        return (int) number;
    }
    public static void main(String[] args) {
        String_to_int_atoi stia = new String_to_int_atoi();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stia.myAtoi(s));
    }
}
