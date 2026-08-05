import java.util.*;

public class Nth_digit {
    public int findNthDigit(int n) {
        long digitLength = 1;
        long count = 9;
        long start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / digitLength;
        String num = Long.toString(start);
        return num.charAt((int) ((n - 1) % digitLength)) - '0';
    }

    public static void main(String[] args) {
        Nth_digit nd = new Nth_digit();
        int n = 2147483647;
        System.out.println(nd.findNthDigit(n));
    }
}
