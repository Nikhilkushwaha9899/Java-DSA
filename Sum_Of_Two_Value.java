import java.util.*;

public class Sum_Of_Two_Value {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        Sum_Of_Two_Value sotv = new Sum_Of_Two_Value();
        int a = 2;
        int b = 3;
        System.out.println(sotv.getSum(a, b));
    }
}