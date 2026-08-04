import java.util.*;

public class Integer_Replacemnt {
    public int integerReplacement(int n) {
        if (n == 0) {
            return -1;
        }
        int count = 0;
        long num = n;
        while (num != 1) {
            if ((num & 1) == 0) {
                num /= 2;
            } else {
                if (num == 3 || ((num & 3) == 1)) {
                    num--;
                } else {
                    num++;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Integer_Replacemnt ir = new Integer_Replacemnt();
        int n = 1024;
        System.out.println(ir.integerReplacement(n));
    }
}
