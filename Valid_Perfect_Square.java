import java.util.*;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        boolean flag = true;
        if (num == 0 || num == 1) {
            return true;
        }
        for (long i = 1; i * i <= num; i++) {
            if (i * i == num) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Valid_Perfect_Square vps = new Valid_Perfect_Square();
        int num = 2147483647;
        System.out.println(vps.isPerfectSquare(num));
    }
}