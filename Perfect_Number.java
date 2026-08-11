import java.util.*;

public class Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        List<Integer> li = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                li.add(i);
            }
        }
        for (int i = 0; i < li.size(); i++) {
            sum += li.get(i);
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Perfect_Number pm = new Perfect_Number();
        int num = 28;
        System.out.println(pm.checkPerfectNumber(num));
    }
}