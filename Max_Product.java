import java.util.*;

public class Max_Product {
    public int maxProduct(int n) {
        int result = 0;
        int result2 = 0;
        if (n == 0) {
            result = 0;
            return result;
        }
        while (n != 0) {
            int i = n % 10;
            if (i > result) {
                result2 = result;
                result = i;
            } else if (i > result2) {
                result2 = i;
            }
            n /= 10;
        }
        return result * result2;
    }

    public static void main(String[] args) {
        Max_Product mp = new Max_Product();
        int n = 267;
        System.out.println(mp.maxProduct(n));
    }
}