import java.util.*;
public class Super_pow {
    static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        return helper(a % MOD, b, b.length - 1);
    }
    private int helper(int a, int[] b, int index) {
        if (index < 0) {
            return 1;
        }
        int part1 = power(helper(a, b, index - 1), 10);
        int part2 = power(a, b[index]);
        return (part1 * part2) % MOD;
    }
    private int power(int a, int n) {
        int res = 1;
        a %= MOD;

        for (int i = 0; i < n; i++) {
            res = (res * a) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Super_pow sp= new Super_pow();
        int a = 2147483647;
        int b[] = { 2, 0, 0 };
        System.out.println(sp.superPow(a, b));
    }
}

