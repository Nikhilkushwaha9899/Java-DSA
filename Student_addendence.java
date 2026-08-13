import java.util.*;

public class Student_addendence {
    public boolean checkRecord(String s) {
        if (s.length() == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        if (count < 2 && !s.contains("LLL")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Student_addendence sa = new Student_addendence();
        String s = "APLLA";
        System.out.println(sa.checkRecord(s));
    }
}