import java.util.*;
public class Power_of_Four {
public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
         while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }
    public static void main(String[] args) {
        Power_of_Four pof=new Power_of_Four();
        int n=16;
        System.out.println(pof.isPowerOfFour(n));
    }
}